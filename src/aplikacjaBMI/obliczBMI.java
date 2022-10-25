package aplikacjaBMI;

public class obliczBMI {
    protected int waga;
    protected int wzrost;

    public int getWaga () {
        return waga;
    }

    public void setWaga (int waga) {
        this.waga = waga;
    }

    public int getWzrost () {
        return wzrost;
    }

    public void setWzrost (int wzrost) {
        this.wzrost = wzrost;
    }

    protected String calculateBMI(int waga, int wzrost){
        String napis = "";

        double BMI = waga / ((wzrost/100.0)*(wzrost/100.0));

        if(BMI < 16d) napis = "wygłodzenie";
          else
          if((BMI >= 16d) && (BMI < 17d))  napis = "wychudzenie";
            else
            if((BMI >= 17d) && (BMI < 18.50d))  napis = "niedowaga";
              else
              if((BMI >= 18.5d) && (BMI < 25d))  napis = "wartość prawidłowa";
                else
                if((BMI >= 25d) && (BMI < 30d))  napis = "nadwaga";
                  else
                  if((BMI >= 30d) && (BMI < 35d))  napis = "otyłość I stopnia";
                    else
                    if((BMI >= 35d) && (BMI < 40d))  napis = "otyłość II stopnia";
                      else  napis = "otyłość skrajna";
        return napis;
    }

    public obliczBMI(int Waga, int Wzrost){
            setWaga(Waga);
            setWzrost(Wzrost);
    }

}
