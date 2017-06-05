
public class Book {
private String sku;
private String title;
private String author;
private String desc;
private double price;

public Book(String sku, String title, String author, String desc, double price)
{
	this.sku=sku;
	this.title=title;
	this.author=author;
	this.desc=desc;
	this.price=price;
}

public void isAvail(String sku)
{
	System.out.println("Book information: "+title+"\t"+author+"\t"+desc+"\t"+price); 
}
public String getSku() {
	return sku;
}

public void setSku(String sku) {
	this.sku = sku;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getDescription() {
	return desc;
}

public void setDescription(String desc) {
	this.desc = desc;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
}
