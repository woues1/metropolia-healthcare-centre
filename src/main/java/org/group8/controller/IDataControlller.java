package org.group8.controller;

import org.group8.simulator.model.Distribution;
import org.group8.simulator.model.SimulationResults;

import java.util.List;

public interface IDataControlller {
    double getProbability(String decisionType);
    void setProbabilities(double lab, double xray, double treatment);

    String getDistribution(String event);
    double getAverageTime(String event);

    Distribution getDistributionObject(String event);
    void updateDistribution(String event, String distribution, double averageTime);
    void setDefaultDistributions();

    List<SimulationResults> getSimulationResults();
}
