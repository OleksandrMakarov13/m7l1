package module8L2.enums;

public class EnumTest {

    public static void main(String[] args) {
        try {
            System.out.println(getCurrencyName(Currency.EUR));
            System.out.println(getCurrencyName(Currency.UAH));
            System.out.println(getCurrencyName(Currency.USD));
//            System.out.println(getCurrencyName(Currency.OTHER));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

//      name()
        String someCurrencyInput = "EUR";
        if(someCurrencyInput.equals(Currency.EUR.name())){
            System.out.println("It was Euro");
        } else {
            System.out.println("It was not Euro");
        }

//        equality of enums
        Currency someCurrencyInput2 = Currency.USD;
//        Currency someCurrencyInput2 = Currency.OTHER;
        if (someCurrencyInput2 == Currency.USD){
            System.out.println("It was Dollar USA");
        } else {
            System.out.println("It wasn't Dollar USA");
        }

//        valueOf()
        String someCurrencyInput3 = "UAH";
        if (Currency.valueOf(someCurrencyInput3) == Currency.UAH){
            System.out.println("Це була гривня");
        } else {
            System.out.println("Це не була гривня");
        }

//        toString()
        System.out.println(Currency.UAH);
        System.out.println(Currency.USD);

//      ordinal()
        System.out.println(Currency.OTHER.ordinal());

//      values()
        Currency[] values = Currency.values();
        for (Currency value : values) {
            System.out.println(value);
        }

        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getValue());
        instance.setValue(3);
        System.out.println(instance.getValue());


    }

    public static String getCurrencyName(Currency currency) throws IllegalAccessException {
        switch (currency) {
            case EUR:
                return "Евро";
            case UAH:
                return "Гривня";
            case USD:
                return "Доллар США";
        }
        throw new IllegalAccessException("Валюти немає в переліку");
    }
}
