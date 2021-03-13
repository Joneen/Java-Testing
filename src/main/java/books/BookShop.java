package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        int nrDifferent = 0;
        int nrOfBooks = 0;
        double totalCost;
        for(int i = 0; i < books.length; i++){
            if(books[i] >= 1){
                nrDifferent++;
                nrOfBooks += books[i];
            }
        }
        if(nrDifferent == 2){
            totalCost = (nrDifferent*8*0.93) + ((nrOfBooks-nrDifferent)*8);
        }else if(nrDifferent == 3){
            totalCost = (nrDifferent*8*0.86) + ((nrOfBooks-nrDifferent)*8);
        }else if(nrDifferent == 4){
            totalCost = (nrDifferent*8*0.72) + ((nrOfBooks-nrDifferent)*8);
        }else if(nrDifferent == 5){
            totalCost = (nrDifferent*8*0.65) + ((nrOfBooks-nrDifferent)*8);
        }else{
            totalCost = nrOfBooks * 8;
        }

        //TODO complete
        return totalCost;
    }
}
