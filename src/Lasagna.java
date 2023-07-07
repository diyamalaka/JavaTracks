public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        int expectedTime = 40;
        return expectedTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTime)
    {
        int expectedTime = expectedMinutesInOven();
        return expectedTime - actualTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers)
    {
        int layerTime = 2;
        layerTime = layerTime * layers;
        return layerTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int prepTime)
    {
        int layerTime = preparationTimeInMinutes(layers);
        int totTime = layerTime + prepTime;
        return totTime;
    }
}
