import java.lang.reflect.Array;

public class Conditional {
    public static void main(String[] args) {
        int releaseYear  ;
        boolean isIncludedInPlan = true;
        double movieRating;
        String tipoPlano = "na";

        if( isIncludedInPlan || tipoPlano.equals("plus")){
            System.out.println("filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

    }
}
