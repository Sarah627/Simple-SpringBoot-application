package springboot.app.FinancialAidForm.model;

public class FormResponse {
    private String response;

    public FormResponse(String response) {
        this.response = response;
    }

    public FormResponse() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
