package cm.oca.iuc.rs.service;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import cm.oca.iuc.rs.metier.Article;


@Path(value="/articlerest")
public class ArticleService {

	@GET
	@Path(value="/totalprice/{quantite}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public double calculPrixTotal(@PathParam(value = "quantite")int qte) {
		return qte * 125;
	}

	@GET
	@Path(value="/unarticle/{code}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Article getArticleByCode(@PathParam(value = "code")Long code) {
		return  new Article(code, "Ordinateur", "DELL", 300000);
	}

	@GET
	@Path(value="/listarticle")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Article> getArticles() {
		List<Article> articles = new ArrayList<>();
		
		articles.add(new Article(1L, "Ordinateur", "DELL", 300000));
		articles.add(new Article(2L, "Imprimante", "HP", 250000));
		articles.add(new Article(4L, "Scanne", "HP", 385000));
		articles.add(new Article(5L, "Sac", "ZARA", 70000));
		
		return  articles;
	}
}
