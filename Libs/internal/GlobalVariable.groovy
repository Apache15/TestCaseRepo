package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object tenantURL
     
    /**
     * <p></p>
     */
    public static Object tenantUsername
     
    /**
     * <p></p>
     */
    public static Object tenantPassword
     
    /**
     * <p></p>
     */
    public static Object endClientUsername
     
    /**
     * <p></p>
     */
    public static Object endClientPassword
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            tenantURL = selectedVariables['tenantURL']
            tenantUsername = selectedVariables['tenantUsername']
            tenantPassword = selectedVariables['tenantPassword']
            endClientUsername = selectedVariables['endClientUsername']
            endClientPassword = selectedVariables['endClientPassword']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
