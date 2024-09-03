import java.util.ArrayList;
import java.util.List;

import co.grandcircus.geology.Mesa;
import co.grandcircus.geology.Mountain;
import co.grandcircus.geology.iFormation;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<iFormation> formList = new ArrayList<>();
        Mountain mount1 = new Mountain(2000000, "Everest");
        Mountain mount2 = new Mountain(10000, "Lil Guy");
        Mesa mesa1 = new Mesa(5000, 250000, "Black Mesa");
        Mesa mesa2 = new Mesa(50000, 250000, "Grand Mesa");
        formList.add(mount1);
        formList.add(mount2);
        formList.add(mesa1);
        formList.add(mesa2);

        showInfo(formList);

        System.out.println("Here is the tallest formation.");
        iFormation tallest = findTallest(formList);
        System.out.println(tallest.getInfo());
    }


    public static void showInfo(ArrayList<iFormation> arrayList){
        for(iFormation form: arrayList){
            System.out.println(form.getInfo());
        }
    }

    public static iFormation findTallest(ArrayList<iFormation> arrayList){
       iFormation tallest = arrayList.get(0);
        for(iFormation form: arrayList){
            if(form.getHeight() > tallest.getHeight()){
                form = tallest;
            }
        }
        return tallest;
        
    }
}
