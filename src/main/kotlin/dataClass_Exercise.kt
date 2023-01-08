import kotlin.random.Random

/**
 * A network server responds with this information about blog articles
 * Title
 * Content
 * Number of readers
 * You receive 2 articles from the server.
 * Update the title to suit your blog but also keep the originals.
 * Print out all the article information.
 */

data class Article(
    val title: String,
    val content: String,
    val numberOfReaders: Int
)

fun getArticle(): Article {
    val randomTitle = "Title" + Random.nextInt(100)
    val randomReaders =Random.nextInt(1000)
    return Article(randomTitle, "Some Contents", randomReaders)
}
fun main(args: Array<String>) {
    val articles = arrayListOf<Article>()
    articles.add(getArticle())
    articles.add(getArticle())
    println(articles)
    val newArticles = arrayListOf<Article>()
    articles.forEach {
        newArticles.add(it)
        val newArticle = it.copy(title = it.title + " for my blog")
        newArticles.add( newArticle )
    }
   newArticles.forEach { println(it) }

}