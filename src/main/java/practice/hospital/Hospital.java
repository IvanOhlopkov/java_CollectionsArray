package practice.hospital;

import java.util.Random;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        final float MIN_TEMPERATURE = 32;
        final float MAX_TEMPERATURE = 40;
        float[] patientsTemperature = new float[patientsCount];
        Random random = new Random();
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] = random.nextFloat((MAX_TEMPERATURE
                    - MIN_TEMPERATURE)) + MIN_TEMPERATURE;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        StringBuilder patients = new StringBuilder();
        float summaryTemperature = 0F;
        String averageTemperature = "";
        final float NORMAL_MIN_TEMPERATURE = 36.2F;
        final float NORMAL_MAX_TEMPERATURE = 36.9F;
        int healthyPatients = 0;
        for (int i = 0; i < temperatureData.length; i++) {
            patients.append(temperatureData[i]).append(" ");
            summaryTemperature = temperatureData[i] + summaryTemperature;
            if (i == temperatureData.length - 1) {
                averageTemperature = String.format("%.2f", summaryTemperature / temperatureData.length);
            }
            if (temperatureData[i] >= NORMAL_MIN_TEMPERATURE
                    && temperatureData[i] <= NORMAL_MAX_TEMPERATURE) {
                healthyPatients = healthyPatients + 1;
            }
        }
        String patientsTemperature = patients.toString().strip();

        return "Температуры пациентов: " + patientsTemperature +
                "\nСредняя температура: " + averageTemperature +
                "\nКоличество здоровых: " + healthyPatients;
    }
}
