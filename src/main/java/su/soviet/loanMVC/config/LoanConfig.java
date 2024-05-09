package su.soviet.loanMVC.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties("loan")
public class LoanConfig {
    private int minimalIncome;
    private  int minimalCarPrice;
    private int sixMonthsIncomeCoeff;
    private double propertyCoeff;
}
