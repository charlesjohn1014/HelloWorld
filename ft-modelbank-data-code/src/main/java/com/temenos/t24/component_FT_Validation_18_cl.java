/*   |   *//************** TAFJ INFO ***************************************/
/*   |   *//* <TAFJ-BP>C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\FT.Modelbank.component<\TAFJ-BP>  */
/*   |   *//* <TAFJ-BPA><\TAFJ-BPA>  */
/*   |   *//* <TAFJ-BN>component.FT.Validation<\TAFJ-BN>  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   */package com.temenos.t24;
/*   |   */
/*   |   */import com.temenos.tafj.common.jVar;
/*   |   */import com.temenos.tafj.common.jVarFactory;
/*   |   */import java.util.Vector;
/*   |   */import java.lang.reflect.Method;
/*   |   */import java.util.HashMap;
/*   |   */import com.temenos.api.T24TypesAbstractConvertible;
/*   |   */import com.temenos.api.ComplexTypeHelper;
/*   |   */import com.temenos.api.GenericRecordHelper;
/*   |   */import com.temenos.api.exceptions.T24CoreException;
/*   |   */import com.temenos.api.exceptions.T24IllegalArgumentException;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_Core;
/*   |   */import com.temenos.tafj.core.nativecomponents.TF_ErrorHandling;
/*   |   */import com.temenos.tafj.common.PreciseDecimal;
/*   |   */import com.temenos.tafj.common.jSession;
/*   |   */import com.temenos.tafj.common.constants.ConstantsSystem;
/*   |   */import com.temenos.tafj.common.util.BasicConvert;
/*   |   */import com.temenos.tafj.runtime.jRunTime;
/*   |   */import com.temenos.tafj.runtime.jAtVariable;
/*   |   */import com.temenos.tafj.t24.*;
/*   |   */import com.temenos.tafj.api.client.impl.T24Context;
/*   |   */import com.temenos.api.ListHelper;
/*   |   */import java.util.ArrayList;
/*   |   */import java.util.List;
/*   |   */import com.temenos.api.TString;
/*   |   */import com.temenos.api.TNumber;
/*   |   */import com.temenos.api.TDate;
/*   |   */import com.temenos.api.TBoolean;
/*   |   */import com.temenos.api.TStructure;
/*   |   */import com.temenos.api.TValidationResponse;
/*   |   */import com.temenos.tafj.common.IntAndKey;
/*   |   */import com.temenos.tafj.common.DefaultLogger;
/*   |   */
/*   |   */ //COMPONENTDEF component_FT_Validation_18_cl
/*   |   */@SuppressWarnings("unused")
/*   |   */public class component_FT_Validation_18_cl extends jRunTime {
/*   |   */    private final jSession session;
/*   |   */    private final TF_Core TF_Core;
/*   |   */    private final TF_ErrorHandling TF_ErrorHandling;
/*   |   */    
/*   |   */    public component_FT_Validation_18_cl(jSession session) { // constructor
/*   |   */        this.session = session;
/*   |   */        super.init(session);
/*   |   */        this.TF_Core = new TF_Core(this);
/*   |   */        this.TF_ErrorHandling = new TF_ErrorHandling(this);
/*   |   */    }
/*   |   */    public component_FT_Validation_18_cl() { // empty constructor for introspection
/*   |   */        this.session = null;
/*   |   */        this.TF_Core = null;
/*   |   */        this.TF_ErrorHandling = null;
/*   |   */    }
/*   |   */    //END 
/*   |   */    
/*   |   */    
/*   |   */    public jVar OperationName(Object _ArgumentName) {
/*   |   */          if (jRunTime.logComponentUsageEnabled(session)){
/*   |   */               jRunTime.logComponentUsage(this.session, "FT.Validation", "METHOD", "OperationName", "V.FT.VALIDATION");
/*   |   */          }
/*   |   */          if (this.session.isUnitTest()) {
/*   |   */              return this.session.findStub("FT.Validation.OperationName", "V.FT.VALIDATION").invoke(_ArgumentName);
/*   |   */          } else {
/*   |   */              jRunTime jrt = V_FT_VALIDATION_cl.INSTANCE(this.session);
/*   |   */              jVar ret = jrt.invoke(_ArgumentName);
/*   |   */    	       return ret;
/*   |   */          }
/*   |   */    }
/*   |   */    
/*   |   */    //
/*   |   */    // static map & method to verify if a method is an instance of an interface
/*   |   */    //  @see TF.Core.instanceof() method
/*   |   */    // 
/*   |   */    private static HashMap<String, String> hmMethodsInterface = new HashMap<String, String>();
/*   |   */    static{
/*   |   */    }
/*   |   */    public static int instanceOf(String sMethod, String sInterface) {
/*   |   */        DefaultLogger.debug("instanceOf('" + sMethod + "', '" + sInterface + "')");
/*   |   */        for (String sKey : hmMethodsInterface.keySet()) {
/*   |   */            DefaultLogger.debug("hmMethodsInterface : '" + sKey + "' -> '" + hmMethodsInterface.get(sKey) + "'");
/*   |   */        }
/*   |   */        String sInstance = hmMethodsInterface.get(sMethod);
/*   |   */        DefaultLogger.debug("sInstance : '" + sInstance + "'");
/*   |   */        if (sInstance == null || !sInstance.equals(sInterface)) {
/*   |   */            DefaultLogger.debug("return 0");
/*   |   */            return 0;
/*   |   */        } else {
/*   |   */            DefaultLogger.debug("return 1");
/*   |   */            return 1;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar CallAt(Object subroutine, Object... params) {
/*   |   */        String sSubroutine = jVarFactory.get(subroutine).toString();
/*   |   */        try {
/*   |   */            Method met = component_FT_Validation_18_cl.class.getDeclaredMethod(sSubroutine, new Class[] {Object.class });
/*   |   */            Object[] args = new Object[params.length];
/*   |   */            for (int i = 0; i < params.length; i++) {
/*   |   */                args[i] = params[i];
/*   |   */            }
/*   |   */            Object ret = met.invoke(this, args);
/*   |   */            return (jVar) ret;
/*   |   */        } catch (Exception e) {
/*   |   */            super.logError("Invocation error", e);
/*   |   */        }
/*   |   */        return null;
/*   |   */    }
/*   |   */    
/*   |   */    //For Sanity Check
/*   |   */    public static String[] getDependenciesStatic(){
/*   |   */        String ret[] = new String[1];
/*   |   */        ret[0] = "V.FT.VALIDATION";
/*   |   */        return ret;
/*   |   */    }
/*   |   */    
/*   |   */    //For Debugger and tShow
/*   |   */    public String getPathFileNameBasic(){
/*   |   */        return "C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\FT.Modelbank.component";
/*   |   */    }
/*   |   */    
/*   |   */    //static method
/*   |   */    public static String getPathFileNameBasicStatic(){
/*   |   */        return "C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\FT.Modelbank.component";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getCompileInfo() {
/*   |   */        return "1542794168284	21 Nov 2018 10:56:08	PC-LU-0057	3";
/*   |   */    }
/*   |   */    
/*   |   */    // static method
/*   |   */    public static String getCompileInfoStatic() {
/*   |   */        return "1542794168284	21 Nov 2018 10:56:08	PC-LU-0057	3";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getPackageBasic() {
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getPackageBasicStatic() {
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getImportBasic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getImportBasicStatic() {
/*   |   */        return "com.temenos.t24";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getVersion() {
/*   |   */        return "R18_AMR.0";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getVersionStatic() {
/*   |   */        return "R18_AMR.0";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getReplacementInfo() {
/*   |   */        return "false";
/*   |   */    }
/*   |   */    public static String getServiceDefinition() {
/*   |   */        return "eNodzT0LwjAYBOD9/RU36hLs4uAWFSFQ0qVkEYdgXmokHyVNJ/G/G7s+d9w9c5xz4lRxG4WxwTtbfU4UudqYHQfDZWmAThyJmqyB0cJXdhhmLltb28jYkdKQZVpjW9tkqcWnCfeDEN2D9vQhAO/z5QQj/m+yV1c5qkHTl362uSv9";
/*   |   */    }
/*   |   */
/*   |   */}

