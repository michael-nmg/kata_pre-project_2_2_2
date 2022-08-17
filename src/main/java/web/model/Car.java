package web.model;

public class Car {
    private String developer;
    private String model;
    private Integer series;

    public Car() {}

    public Car(String developer, String model, Integer series) {
        this.developer = developer;
        this.model = model;
        this.series = series;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getModel() {
        return model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setDeveloper() {
        this.developer = developer;
    }

    public void setModel() {
        this.model = model;
    }

    public void setSeries() {
        this.series = series;
    }

    @Override
    public String toString() {
        return String.format("%s: %s-%s", developer, model, series);
    }
}
