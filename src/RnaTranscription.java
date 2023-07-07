public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        /*
        G -> C
        C -> G
        T -> A
        A -> U
        */
        String out = "";
        for (char c: dnaStrand.toCharArray()) {
            switch (c) {
                case 'G':
                    out += "C";
                    break;
                case 'C':
                    out += "G";
                    break;
                case 'T':
                    out += "A";
                    break;
                case 'A':
                    out += "U";
                    break;
                default:
                    out += "";
                    break;
            }
        }
        return out;
    }
}