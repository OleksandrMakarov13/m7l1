package module8L2.enums;

public enum Currency {
    USD,
    UAH,
    OTHER,
    EUR;



    @Override
    public String toString() {
        switch (this) {
            case EUR:
                return "Евро!!!";
            case UAH:
                return "Гривня!!!";
            case USD:
                return "Доллар США!!!";
        } return "Other currency!!!";
    }

//Bad practice
//    @Override
//    public String toString() {
//        return "Some currency";
//    }
}
