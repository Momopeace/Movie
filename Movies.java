import java.util.Arrays;

class Movies {

   public static void main(String[] args){
   
   String[] movies = {" le royaume du crane de cristal", "la derniere croisade", "le temple maudit"};
   String[] actor1 = {"Harisson ford", "Shia Leboeuf","Karen Allen" };
   String[] actor2 = {"Harisson ford", "Sean Connery","Dnholm Elliott" }; 
   String[] actor3 = {"Harisson ford", "Ke huy Quan","Kate Capshaw" };
   String[][] films;
   films = new String[][] {
   actor1, actor2, actor3};
   
   for(int i=0; i<films.length; i++){
   System.out.println("film"+movies[i]+"acteurs"+Arrays.toString(films[i]));} 
}
}

