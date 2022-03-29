package librerias;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class EjCommons {
    public static void main(String[] args) {
        double[] inputArray={12.3,1.0,2.3,3.14,5.65,8.0,24.0,36.45,45.72};
        // Get a DescriptiveStatistics instance
        DescriptiveStatistics stats = new DescriptiveStatistics();
        for( int i = 0; i < inputArray.length; i++) {
            stats.addValue(inputArray[i]);
        }
        // Compute some statistics
        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double max = stats.getMax();
        double min = stats.getMin();
        double variance=stats.getVariance();
        System.out.println(mean+"\n"+std+"\n"+max+"\n"+min+"\n"+variance);
    }
}
