class ResistorColor {
    String colorBand[] = {"black", "brown", "red", "orange", "yellow","green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
        for(int i =0 ; i <= 9; i ++)
        {
            if(color.equals(colorBand[i]))
                return i;
        }
        return -1;
    }

    String[] colors() {
        return colorBand;
    }
}
