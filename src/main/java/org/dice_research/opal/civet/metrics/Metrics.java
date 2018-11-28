package org.dice_research.opal.civet.metrics;

import java.util.HashMap;
import java.util.Map;

/**
 * Metrics catalog.
 *
 * @author Adrian Wilke
 */
public class Metrics {

	/**
	 * Gets all metrics of the dimension expressiveness.
	 */
	public Map<String, Metric> getMetricsExpressiveness() {
		Map<String, Metric> metrics = new HashMap<String, Metric>();
		putMetricIntoMap(new CategorizationMetric(), metrics);
		putMetricIntoMap(new DescriptionMetric(), metrics);
		return metrics;
	}

	/**
	 * Gets all metrics of the dimension contact.
	 */
	public Map<String, Metric> getMetricsContact() {
		Map<String, Metric> metrics = new HashMap<String, Metric>();
		putMetricIntoMap(new ContactEmailMetric(), metrics);
		putMetricIntoMap(new ContactUrlMetric(), metrics);
		return metrics;
	}

	/**
	 * Gets all metrics.
	 */
	public Map<String, Metric> getMetrics() {
		Map<String, Metric> metrics = new HashMap<String, Metric>();
		metrics.putAll(getMetricsExpressiveness());
		metrics.putAll(getMetricsContact());
		return metrics;
	}

	/**
	 * Puts ID of metric and the metric itself in the map.
	 */
	private void putMetricIntoMap(Metric metric, Map<String, Metric> map) {
		map.put(metric.toString(), metric);
	}
}