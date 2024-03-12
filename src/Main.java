import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ProgrammingBook pBook1 = new ProgrammingBook("p1","Toan",15000,"TG1","VNE","Logic");
        ProgrammingBook pBook2 = new ProgrammingBook("p2","english",30000,"TG2","Java","Learn");
        ProgrammingBook pBook3 = new ProgrammingBook("p3","Ngu Van",20000,"TG3","VNE","Learn");
        FictionBook fBook1 = new FictionBook("f1","Java",20000,"TG4","Vien tuong 1");
        FictionBook fBook2 = new FictionBook("f2","C##",10000,"TG5","Vien tuong 2");
        FictionBook fBook3 = new FictionBook("f3","Python",30000,"TG6","Vien tuong 3");
        Book[] list = new Book[6];
        list[0] = pBook1;
        list[1] = pBook2;
        list[2] = pBook3;
        list[3] = fBook1;
        list[4] = fBook2;
        list[5] = fBook3;
        double sum = 0;
        for(int i=0;i<list.length;i++){
            sum += list[i].getMount();
        }
        System.out.println("Tổng giá trị 6 cuốn sách là "+sum);
        int countLanguageBook = 0;
        for(int j=0;j<list.length;j++){
            if(list[j] instanceof ProgrammingBook){
                if(Objects.equals(((ProgrammingBook) list[j]).getLanguage(), "Java")){
                    countLanguageBook++;
                }
            }
        }
        System.out.println("Tổng số sách có ngôn ngữ Java là: " + countLanguageBook);
        int countCategoryBook = 0;
        for(int j=0;j<list.length;j++){
            if(list[j] instanceof FictionBook){
                if(Objects.equals(((FictionBook) list[j]).getCategory(), "Vien tuong 1")){
                    countCategoryBook++;
                }
            }
        }
        System.out.println("Tổng số sách Vien tuong 1 là: " + countCategoryBook);
        int countPriceFBook=0;
        for(int j=0;j<list.length;j++){
            if(list[j] instanceof FictionBook){
                if(list[j].getMount() < 15000){
                    countPriceFBook++;
                }
            }
        }
        System.out.println("Tổng số sách loại Fiction có giá nhỏ hơn 15000 là: " + countPriceFBook);


    }
}
