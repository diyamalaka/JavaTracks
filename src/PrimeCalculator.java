class PrimeCalculator {

    public boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    int nth(int nth) {

        if(nth == 0)
            throw new IllegalArgumentException();

        int count = 0;
        int result = 0;
        int i = 2;

        while(count != nth) {

            if(isPrime(i))
                count++;

            if(count == nth)
                result = i;

            i++;

        }
        return result;
    }
}