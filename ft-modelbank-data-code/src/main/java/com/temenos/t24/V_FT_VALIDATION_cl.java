/*   |   *//*  @ValidationCode : MjotMTMzNTk0MzcyOkNwMTI1MjoxNDgxNTU2MjIyNDAwOm11bWVzaDotMTotMTowOjA6ZmFsc2U6Ti9BOkRFVl8yMDE2MTIuMjAxNjEyMDItMDk1NjotMTotMQ== */
/*   |   *//*  @ValidationInfo : Timestamp         : 12 Dec 2016 16:23:42 */
/*   |   *//*  @ValidationInfo : Encoding          : Cp1252 */
/*   |   *//*  @ValidationInfo : User Name         : mumesh */
/*   |   *//*  @ValidationInfo : Nb tests success  : N/A */
/*   |   *//*  @ValidationInfo : Nb tests failure  : N/A */
/*   |   *//*  @ValidationInfo : Rating            : N/A */
/*   |   *//*  @ValidationInfo : Coverage          : N/A */
/*   |   *//*  @ValidationInfo : Strict flag       : N/A */
/*   |   *//*  @ValidationInfo : Bypass GateKeeper : false */
/*   |   *//*  @ValidationInfo : Compiler Version  : DEV_201612.20161202-0956 */
/*   |   *//* ----------------------------------------------------------------------------- */
/*   |   *//*  <Rating>0</Rating> */
/*   |   *//* ----------------------------------------------------------------------------- */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   *//* <TAFJ-BP>C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\V.FT.VALIDATION.b<\TAFJ-BP>  */
/*   |   *//* <TAFJ-BPA>FT.Validation<\TAFJ-BPA>  */
/*   |   *//* <TAFJ-BN>V.FT.VALIDATION<\TAFJ-BN>  */
/*   |   *//************** TAFJ INFO ***************************************/
/*   |   */package com.temenos.t24;
/*   |   */
/*   |   */import com.temenos.tafj.common.jVar;
/*   |   */import com.temenos.tafj.common.jVarFactory;
/*   |   */import com.temenos.tafj.common.jVarConstFactory;
/*   |   */import com.temenos.tafj.common.PreciseDecimal;
/*   |   */import com.temenos.tafj.common.jSession;
/*   |   */import com.temenos.tafj.common.Environment;
/*   |   */import com.temenos.tafj.common.BasicRuntimeException;
/*   |   */import com.temenos.tafj.common.exception.JBCCatchableException;
/*   |   */import com.temenos.tafj.common.exception.NeedRestartException;
/*   |   */import com.temenos.tafj.common.jPosition;
/*   |   */import com.temenos.tafj.common.Constants;
/*   |   */import com.temenos.tafj.runtime.jRunTime;
/*   |   */import com.temenos.tafj.runtime.jAtVariable;
/*   |   */import java.lang.reflect.Field;
/*   |   */import com.temenos.tafj.common.jSystem;
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
/*   |   */ //SUBROUTINE V_FT_VALIDATION_cl
/*   |   */@SuppressWarnings("unused")
/*   |   */public class V_FT_VALIDATION_cl extends jRunTime {
/*   |   */    public component_FT_Validation_18_cl FT_Validation = null;
/*   |   */    // Empty Constructor
/*   |   */    public V_FT_VALIDATION_cl(){
/*   |   */    }
/*   |   */    
/*   |   */    // Loop when program needs to pause (debug)
/*   |   */    private boolean _inMove_ = false;
/*   |   */    
/*   |   */    // used for common variable re-initisation
/*   |   */    private boolean _commonWasNull = false;
/*   |   */    
/*   |   */    @Override
/*   |   */    public void keepMoving(){
/*   |   */    	this._inMove_ = true;
/*   |   */    	while(this._inMove_){
/*   |   */    		move();
/*   |   */    	}
/*   |   */    }
/*   |   */    public void move(){
/*   |   */    	try {
/*   |   */    		Thread.sleep(200);
/*   |   */    	} catch (InterruptedException e) {
/*   |   */    	}
/*   |   */    }
/*   |   */    @Override
/*   |   */    public void stopMoving(){
/*   |   */    	this._inMove_ = false;
/*   |   */    }
/*   |   */    
/*   |   */    protected int main(){
_l(    18,true);        INSERT__I__COMMON();  // $INSERT _I__COMMON
_l(    19,true);        INSERT__I__EQUATE();  // $INSERT _I__EQUATE
_l(    21);        if (boolVal(op_gt(aGet(_R_NEW,_FT_CREDIT_AMOUNT),500)))
/*   |   */        {
_l(    22);            set(_E, "Amount greater than 500 (DS packager demo) ");
/*   |   */        }
_l(    23);         //ENDIF
/*   |   */        //END 
/*   |   */        return LABEL_STOP;                            //END
/*   |   */    }
/*   |   */    
/*   |   */    public jVar invoke(Object ... args) {
/*   |   */        if (args.length != 1 ) {
/*   |   */            throw new RuntimeException("Wrong number of arguments : V.FT.VALIDATION has 1 arguments ");
/*   |   */        }
/*   |   */        while(true){
/*   |   */            try{
/*   |   */                return invoke(args[0]);
/*   |   */            }catch(NeedRestartException nrt){
/*   |   */                invokeRestart("V_FT_VALIDATION_cl",false,  new jVar[]{(jVar)this._P1});
/*   |   */                super.setNeedRestart(false);
/*   |   */                create();  // recreate all the variables.
/*   |   */            }
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    
/*   |   */    private boolean _isBreak_        = false; //flag if a break append in a loop
/*   |   */    private boolean _isContinue_     = false; //flag if a continue append in a loop
/*   |   */    private boolean _loop_          = true;  //need it for the LOOP statement
/*   |   */    private boolean _NeedInitialise_ = true;  //To know whether we have to initialize the common and vars or not
/*   |   */    private String[] _varList_       = null; //List of the variables in this program
/*   |   */    private String[] _componentList_       = null; //List of the component in this program
/*   |   */    private static String[] _paramList_     = null; //List of the parameter of this program
/*   |   */    
/*   |   */    
/*   |   */    public static jRunTime INSTANCE(jSession session) {
/*   |   */        jRunTime prg = null;
/*   |   */        prg =session.getRuntimeCache("V_FT_VALIDATION_cl");
/*   |   */        if (prg == null) {
/*   |   */            prg = new V_FT_VALIDATION_cl();
/*   |   */            prg.init(session);
/*   |   */        }
/*   |   */        return prg;
/*   |   */    }
/*   |   */    
/*   |   */    public void stack(V_FT_VALIDATION_cl prg){
/*   |   */        if (session.setRuntimeCache("V_FT_VALIDATION_cl", prg)){
/*   |   */            //
/*   |   */            // No need to initialise the common and the vars.
/*   |   */            //
/*   |   */            this._NeedInitialise_ = false;
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    public jVar invoke(Object _P1) {
/*   |   */        this._P1 = toVarNoCache(_P1);
/*   |   */        int nStoredPrecision = session.getPrecision();
/*   |   */        invokeStart("V_FT_VALIDATION_cl",false,  new jVar[]{(jVar)this._P1});
/*   |   */        JBCCatchableException _jbce = null;
/*   |   */        int nRet = 0;
/*   |   */        try {
/*   |   */             nRet = main();
/*   |   */        } catch (JBCCatchableException jbce) {
/*   |   */            try {
/*   |   */                if (lbl_CATCH__ERROR() == Integer.MIN_VALUE) {
/*   |   */                    // let's leave normally and throw the exception afterwards
/*   |   */                    _jbce = jbce;
/*   |   */                }
/*   |   */            } catch (JBCCatchableException jbce2) {
/*   |   */                // In the CATCH_ERROR, the exception has been thrown again.
/*   |   */                _jbce = jbce2;
/*   |   */            }
/*   |   */        }
/*   |   */        if (nRet > 0){
/*   |   */            CB(nRet);
/*   |   */        }else{
/*   |   */            check(nRet);
/*   |   */        }
/*   |   */        release();
/*   |   */        invokeStop("V_FT_VALIDATION_cl",false,  new jVar[]{(jVar)this._P1});
/*   |   */        session.setPrecision(nStoredPrecision);
/*   |   */        stack(this);
/*   |   */        if (_jbce != null) {
/*   |   */            throw _jbce;
/*   |   */        }
/*   |   */        return _Sys_RetRoutine;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know the BASIC source file name.
/*   |   */    public String getBASICName(){
/*   |   */        return "V.FT.VALIDATION";
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know the BASIC source file name.
/*   |   */    public static String getBASICNameStatic(){
/*   |   */        return "V.FT.VALIDATION";
/*   |   */    }
/*   |   */    
/*   |   */    // Used by jRuntime when invoking the CodeCoverage.
/*   |   */    public int getNbLines(){
/*   |   */        return 6;
/*   |   */    }
/*   |   */    
/*   |   */    // Static metod used by the CodeCoverage when initializing all the classes
/*   |   */    public static int getNbLinesStatic(){
/*   |   */        return 6;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to know what variables are in this program.
/*   |   */    public String[] getVarList(){
/*   |   */       if (_varList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _varList_ = new String[7];
/*   |   */          _varList_[0] = "E(Common:THE.GLOBUS.COMMON:30)";
/*   |   */          _varList_[1] = "FT.CREDIT.AMOUNT(jVar)";
/*   |   */          _varList_[2] = "P1(jVar)";
/*   |   */          _varList_[3] = "PASSED.CHAR(jVar)";
/*   |   */          _varList_[4] = "PASSED.NO(jVar)";
/*   |   */          _varList_[5] = "R.NEW(Common:THE.GLOBUS.COMMON:6)";
/*   |   */          _varList_[6] = "RUNNING.IN.JBASE(Common:GLOBUS1:9)";
/*   |   */       }
/*   |   */       return _varList_;
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to get a Var Contents.
/*   |   */    public String getVarValue(String sVarName){
/*   |   */       int nPos = sVarName.lastIndexOf("(");
/*   |   */       String sType = "jVar"; // default.
/*   |   */       if (nPos > 0){
/*   |   */           sType = sVarName.substring(nPos + 1, sVarName.length()-1);
/*   |   */           sVarName = sVarName.substring(0,nPos);
/*   |   */       }
/*   |   */       sVarName = jSystem.convertNameVar(sVarName);
/*   |   */       try {
/*   |   */           @SuppressWarnings("rawtypes")
/*   |   */           Class c = this.getClass();
/*   |   */           Field fVar = null;
/*   |   */           try{
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */               sType = fVar.getType().getName();
/*   |   */           }catch(NoSuchFieldException e){
/*   |   */               // In case we have a version with def class
/*   |   */               c = this.getClass().getSuperclass();
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */               sType = fVar.getType().getName();
/*   |   */           }
/*   |   */       if (sType.equals("long")){
/*   |   */           long jv = (Long)fVar.get(this);
/*   |   */           return String.valueOf(jv); 
/*   |   */       }else if (sType.equals("String")){
/*   |   */           String jv = (String)fVar.get(this);
/*   |   */           return jv;           
/*   |   */       }else if (sType.equals("unknow")){
/*   |   */          try{
/*   |   */               jVar jv = (jVar)fVar.get(this);
/*   |   */               return jv.toExternalString();
/*   |   */          }catch(Exception e){
/*   |   */    	   }
/*   |   */          try{
/*   |   */               String jv = (String)fVar.get(this);
/*   |   */               return jv;   
/*   |   */    	   }catch(Exception e){
/*   |   */          }
/*   |   */    	   try{
/*   |   */    		  long jv = (Long)fVar.get(this);
/*   |   */             return String.valueOf(jv); 
/*   |   */    	   }catch(Exception e){
/*   |   */          }
/*   |   */          return "N/A";
/*   |   */       }else{
/*   |   */          jVar jv = (jVar)fVar.get(this);
/*   |   */          return jv.toExternalString();
/*   |   */       }
/*   |   */       } catch (Exception e) {
/*   |   */          return "N/A";
/*   |   */       }
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    // Invoked whenever the debugger needs to set a Var Contents.
/*   |   */    public String setVarValue(String sVarName, String sValue) {
/*   |   */       int nPos = sVarName.lastIndexOf("(");
/*   |   */       String sType = "jVar"; // default.
/*   |   */       if (nPos > 0){
/*   |   */           sType = sVarName.substring(nPos + 1, sVarName.length()-1);
/*   |   */           sVarName = sVarName.substring(0,nPos);
/*   |   */       }
/*   |   */    	sVarName = jSystem.convertNameVar(sVarName);
/*   |   */     try {
/*   |   */           @SuppressWarnings("rawtypes")
/*   |   */           Class c = this.getClass();
/*   |   */           Field fVar = null;
/*   |   */           try{
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */           }catch(NoSuchFieldException e){
/*   |   */               // In case we have a version with def class
/*   |   */               c = this.getClass().getSuperclass();
/*   |   */               fVar = c.getDeclaredField(sVarName);
/*   |   */           }
/*   |   */    		if (sType.equals("long")) {
/*   |   */    			fVar.setLong(this, Long.parseLong(sValue));
/*   |   */    			return sValue;
/*   |   */    		} else if (sType.equals("String")) {
/*   |   */    			fVar.set(this, sValue);
/*   |   */    			return sValue;
/*   |   */    		} else {
/*   |   */    			jVar jv = (jVar) fVar.get(this);
/*   |   */    			jv.set(sValue);
/*   |   */    			return sValue;
/*   |   */    		}
/*   |   */    	} catch (Exception e) {
/*   |   */    		return "! Failure !";
/*   |   */    	}
/*   |   */    }
/*   |   */    
/*   |   */    //FUNCTIONS
/*   |   */    
/*   |   */    //INSERT
/*   |   */    public int INSERT__I__COMMON(){
/*     1 */        /*  Version 38 18/10/00  GLOBUS Release No. G15.0.01 31/08/04 */
/*     2 */        /*  "I_COMMON",840421-001 * INSERT COMMON */
/*     3 */        /*  */
/*     4 */        /*  C a u t i o n :   After a change of this routine, don't forget to */
/*     5 */        /*                    move it to RG.BP for use of report generator */
/*     6 */        /*  */
/*     7 */        /* ------------------------------------------------------------------------ */
/*     8 */        /*               M O D I F I C A T I O N S */
/*     9 */        /*  */
/*    10 */        /*  20/08/90 - GB9000193 */
/*    11 */        /*             Changed OLD.UPDATE.MODE to R.INTERCO.PARAMETER */
/*    12 */        /*  */
/*    13 */        /*  08-03-94 - GB9400200 */
/*    14 */        /*             R.USER is now a dynamic array */
/*    15 */        /*  */
/*    16 */        /*  13/09/94 - GB9401028 */
/*    17 */        /*             C$.UNIVERSE.RELEASE (universe release level) added. */
/*    18 */        /*  */
/*    19 */        /*  16/02/96 - GB9600193 */
/*    20 */        /*             Change G.SPARE47 to C$.USE.CCY.CACHE. */
/*    21 */        /*  */
/*    22 */        /*  10/02/98 - GB9800123 */
/*    23 */        /*              Store the LOCAL.CURRENCY record as C$R.LCCY */
/*    24 */        /*  21.04.98 - GB9800002 */
/*    25 */        /*             GBS changes. Changed G.SPARE45 to C$BA.PARAMETER */
/*    26 */        /*  */
/*    27 */        /*  12/02/99 - GB9801223 */
/*    28 */        /*              OFS Changes.  Changed G.SPARE44 to C$EB.PHANTOM.ID */
/*    29 */        /*  */
/*    30 */        /*  15/12/99 - GB9901796 */
/*    31 */        /*             Change the Dimensioned arrays from being dimensioned to */
/*    32 */        /*             a unhealthy mixture of 200 and 500 to using a equated */
/*    33 */        /*             value (C$SYSDIM) */
/*    34 */        /*  */
/*    35 */        /*  02/03/00 - GB0000202 */
/*    36 */        /*             New common variable to hold the post closing period date */
/*    37 */        /*  13/03/00 - GB0000406 */
/*    38 */        /*             Change G.SPARE42 to RUNNING.IN.JBASE , Common variable */
/*    39 */        /*             is ment for checking whether GLOBUS is running under */
/*    40 */        /*             JBASE or UNIVERSE. */
/*    41 */        /*  */
/*    42 */        /*  05/04/00 - GB0000709 */
/*    43 */        /*             Setup CHARX() table which hold ASCII or EBCDIC values */
/*    44 */        /*             in new common /ASCIIEBCDIC/ */
/*    45 */        /*  */
/*    46 */        /*             Define a new function SEQX */
/*    47 */        /*  */
/*    48 */        /*  18/04/00 - GB0001078 */
/*    49 */        /*             Define a new function CHARX and return the */
/*    50 */        /*             variable CHARX to be a spare variable. */
/*    51 */        /*  */
/*    52 */        /*  17/05/00 - GB0001258 */
/*    53 */        /*             Initialise PASSED.NO and PASSED.CHAR. */
/*    54 */        /*  */
/*    55 */        /*  02/05/00 - GB001386 */
/*    56 */        /*             Common changed to labelled. */
/*    57 */        /*  */
/*    58 */        /*  04/07/00 - GB0001702 */
/*    59 */        /*             Define new functions CHARSX & SEQSX */
/*    60 */        /*             to replace CHARS & SEQS */
/*    61 */        /*  */
/*    62 */        /*  */
/*    63 */        /*  18/10/20 - GB0002667 */
/*    64 */        /*             Put the precision setting here as it relies on RUNNING.IN .JBASE */
/*    65 */        /*  */
/*    66 */        /*  25/09/01 - GLOBUS_EN_10000172 */
/*    67 */        /*             In jGLOBUS PRECISION should be set to 13. This is */
/*    68 */        /*             done in I_COMMON and OVERLAY.EX */
/*    69 */        /*  */
/*    70 */        /*  17/12/2002 - GLOBUS_EN_10001548 */
/*    71 */        /*               Set running in UTF8 varaible */
/*    72 */        /*  */
/*    73 */        /*  28/05/03 EN_1850 */
/*    74 */        /*           Add new variable for C$FUNCTION.LIST */
/*    75 */        /*           format <1,x> Function id e.g. A I E */
/*    76 */        /*                  <2,x> Local language value for the function e.g. for I you may use X */
/*    77 */        /*                  <3,x> enrichment of funciton in local language */
/*    78 */        /*           C$MULTI.BOOK true if runnin multi-book */
/*    79 */        /*           C$COMP.EOD.LIST Companies where we are running the end of day in a GP environment */
/*    80 */        /*           format <1,x> Company Id */
/*    81 */        /*                  <2,x> Mnemonic */
/*    82 */        /*  */
/*    83 */        /*  02/06/05 - CI_100030780 */
/*    84 */        /*             New variable to control NS operation in applications */
/*    85 */        /*             C$NS.OPERATION */
/*    86 */        /*             "ALL" - NS allowed if installed */
/*    87 */        /*             "NEW" - New deals only if NS installed */
/*    88 */        /*             "NOD" - NS allowed if .NOD in PGM.FILE */
/*    89 */        /* ************************************************************************ */
/*    91 */        /*  */
/*    92 */        /*  GB9901796 */
/*    93 */        /*  This is the Value that will drive all the dimensioned arrays in Globus */
/*    94 */        /*  the are record related (R.XXX, N, T etc.). */
/*    95 */        /*  */
/*    96 */        /*  */
/*    97 */        /*  19/03/04 - BG_100002624 */
/*    98 */        /*             Store the initial dates details of the system when the */
/*    99 */        /*             record is read. This can be compared in AUTH and UNAUTH */
/*   100 */        /*             write to check that the COB has not begun */
/*   101 */        /*  */
/*   102 */        /*  15/04/04 - EN_10002225 */
/*   103 */        /*             Enlarged EU Impacts */
/*   104 */        /*             New variable C$DE.EU.LIST introduced replacing G.SPARE34. */
/*   105 */        /*  */
/*   106 */        /*  19/04/04 - GLOBUS_EN_10002238 */
/*   107 */        /*             Provide Integrity check for local developments to ensure */
/*   108 */        /*             that the system is not corrupted. New variable SENSITIVITY introduced */
/*   109 */        /*             replacing G.SPARE33 */
/*   110 */        /*             SAR Ref.No.SAR-2003-11-21-0008 */
/*   111 */        /*  */
/*   112 */        /*  28/12/05 - EN_10002746 */
/*   113 */        /*             Date display format for japanese market. */
/*   114 */        /*  */
/*   115 */        /*  19/02/07 - EN_10003196 */
/*   116 */        /*             Add method calls to the template. Common variable V$ACTION */
/*   117 */        /*             holds action to be executed and C$ACTION.DETAIL allows */
/*   118 */        /*             context details to be supplied */
/*   119 */        /*  */
/*   120 */        /*  04/01/08 - GLOBUS_EN_10003581 - dgearing@temenos.com */
/*   121 */        /*             replace g.spare25 with c$sc.fee.recalc to allow local */
/*   122 */        /*             devs to re-run a core batch job which should not normally */
/*   123 */        /*             be re-runnable after fees have been generated */
/*   124 */        /*  */
/*   125 */        /*  30/08/08 - EN_10003814 */
/*   126 */        /*             Added WRITE.CACHE variable */
/*   127 */        /*  */
/*   128 */        /*  25/11/09 - BG_100025913 */
/*   129 */        /*             Soft code the folder named T24.BP */
/*   130 */        /*  */
/*   131 */        /*  28/09/09 - EN_10004373 */
/*   132 */        /*             Added T24 session common variable */
/*   133 */        /*  */
/*   134 */        /*  1/11/20011 - EN-185375 / Task-297323 */
/*   135 */        /*             New common C$USE.T24.LOG introduced to decide whether to use either  */
/*   136 */        /*             T24 level log or TAFC logs depends on INT.LOG.FILE field in SPF. */
/*   137 */        /*  */
/*   138 */        /*  08/08/12 - Epic:6066/Story:28564 */
/*   139 */        /*             Implementation of User Roles functionality in T24, introduced USER.ROLE */
/*   140 */        /*  */
/*   141 */        /*  04/01/2013 - Epic : 539391 / Story : 539393 */
/*   142 */        /*               Process running in TAFJ platform is indicated with the flag 'RUNNING.IN.TAFJ' */
/*   143 */        /*  */
/*   144 */        /*  23/01/2014 - Defect 809526/ Task-894923 */
/*   145 */        /*              Deadlock handling for SEAT framework */
/*   146 */        /*  */
/*   147 */        /*  18/03/2016 - Task 1655535 */
/*   148 */        /*  			   Introduced new commons C$DIGITAL.SIGNATURE AND C$DS.RULE.DATA for DIGITAL SIGNATURE feature */
/*   149 */        /*  */
/*   150 */        /*  10/11/16 - Task 1920559 / Defect 1867067 */
/*   151 */        /* 			  Added a new common variable C$MESSAGE.TOKEN */
/*   152 */        /*  */
/*   153 */        /*  6/09/17 - Task 2261872 */
/*   154 */        /*            Added new common variables C$CACHE.RESET.PERIOD and C$CACHE.RESET */
/*   155 */        /*  */
/*   156 */        /*  29/01/18 - Task 2451227 */
/*   157 */        /*            Added new common variable C$DB.LOCKING.MODE. */
/*   158 */        /*  */
/*   159 */        /*  03/04/18 - Task 2533976 */
/*   160 */        /*             Added new common C$RETAIN.ALT.CONCAT to avoid deleting the concat file entry for alternate keys                */
/*   161 */        /*     */
/*   162 */        /* ------------------------------------------------------------------------ */
/*   |   */        /* MACRO : _C_d_SYSDIM EQU TO : 500*/ 
/*   |   */        /* MACRO : _T24_d_BP EQU TO : "T24.BP"*/ 
/*   166 */        /* ************************************************************************ */
/*   167 */        /*  "MATRICES: */
/*   168 */        /*      C A U T I O N:  because of a bug in info-basic it's not possible */
/*   169 */        /*      to separate the following line (except using an additional line */
/*   170 */        /*      without COM - but this does not work with IBM-basic) */
/*   171 */        /*      C A U T I O N:  Definition 200 */
/*   172 */        /*      must be changed when one (!) pgm needs more fields  !!!!!!!!! */
/*   173 */        /*      ... and ... R.NEW(500) must be changed when one table file has */
/*   174 */        /*      more fields .................................................. */
/*   175 */        /* ************************************************************************ */
/*   176 */        /*  "SIMPLE VARIABLES: */
/*   |   */        //if (_CHECKFILE == null) {
/*   |   */        //    _CHECKFILE = session.getCommonNamed("THE.GLOBUS.COMMON",0,_CHECKFILE, "CHECKFILE");
/*   |   */        //    if (_CHECKFILE.getNeedCommonInit()) DIM(_CHECKFILE, 500 );
/*   |   */        //    _CHECKFILE.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R_COMPANY == null) {
/*   |   */        //    _R_COMPANY = session.getCommonNamed("THE.GLOBUS.COMMON",1,_R_COMPANY, "R.COMPANY");
/*   |   */        //    if (_R_COMPANY.getNeedCommonInit()) DIM(_R_COMPANY, 500 );
/*   |   */        //    _R_COMPANY.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_CONCATFILE == null) {
/*   |   */        //    _CONCATFILE = session.getCommonNamed("THE.GLOBUS.COMMON",2,_CONCATFILE, "CONCATFILE");
/*   |   */        //    if (_CONCATFILE.getNeedCommonInit()) DIM(_CONCATFILE, 500 );
/*   |   */        //    _CONCATFILE.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R_DATES == null) {
/*   |   */        //    _R_DATES = session.getCommonNamed("THE.GLOBUS.COMMON",3,_R_DATES, "R.DATES");
/*   |   */        //    if (_R_DATES.getNeedCommonInit()) DIM(_R_DATES, 500 );
/*   |   */        //    _R_DATES.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_F == null) {
/*   |   */        //    _F = session.getCommonNamed("THE.GLOBUS.COMMON",4,_F, "F");
/*   |   */        //    if (_F.getNeedCommonInit()) DIM(_F, 500 );
/*   |   */        //    _F.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_N == null) {
/*   |   */        //    _N = session.getCommonNamed("THE.GLOBUS.COMMON",5,_N, "N");
/*   |   */        //    if (_N.getNeedCommonInit()) DIM(_N, 500 );
/*   |   */        //    _N.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        if (_R_NEW == null) {
/*   |   */            _R_NEW = session.getCommonNamed("THE.GLOBUS.COMMON",6,_R_NEW, "R.NEW");
/*   |   */            if (_R_NEW.getNeedCommonInit()) DIM(_R_NEW, 500 );
/*   |   */            _R_NEW.setNeedCommonInit(false);
/*   |   */        }
/*   |   */        //if (_R_NEW_LAST == null) {
/*   |   */        //    _R_NEW_LAST = session.getCommonNamed("THE.GLOBUS.COMMON",7,_R_NEW_LAST, "R.NEW.LAST");
/*   |   */        //    if (_R_NEW_LAST.getNeedCommonInit()) DIM(_R_NEW_LAST, 500 );
/*   |   */        //    _R_NEW_LAST.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R_OLD == null) {
/*   |   */        //    _R_OLD = session.getCommonNamed("THE.GLOBUS.COMMON",8,_R_OLD, "R.OLD");
/*   |   */        //    if (_R_OLD.getNeedCommonInit()) DIM(_R_OLD, 500 );
/*   |   */        //    _R_OLD.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R_OPF == null) {
/*   |   */        //    _R_OPF = session.getCommonNamed("THE.GLOBUS.COMMON",9,_R_OPF, "R.OPF");
/*   |   */        //    if (_R_OPF.getNeedCommonInit()) DIM(_R_OPF, 500 );
/*   |   */        //    _R_OPF.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R == null) {
/*   |   */        //    _R = session.getCommonNamed("THE.GLOBUS.COMMON",10,_R, "R");
/*   |   */        //    if (_R.getNeedCommonInit()) DIM(_R, 500 );
/*   |   */        //    _R.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_T == null) {
/*   |   */        //    _T = session.getCommonNamed("THE.GLOBUS.COMMON",11,_T, "T");
/*   |   */        //    if (_T.getNeedCommonInit()) DIM(_T, 500 );
/*   |   */        //    _T.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_T_REMTEXT == null) {
/*   |   */        //    _T_REMTEXT = session.getCommonNamed("THE.GLOBUS.COMMON",12,_T_REMTEXT, "T.REMTEXT");
/*   |   */        //    if (_T_REMTEXT.getNeedCommonInit()) DIM(_T_REMTEXT, 500 );
/*   |   */        //    _T_REMTEXT.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_C_d_SPARE == null) {
/*   |   */        //    _C_d_SPARE = session.getCommonNamed("THE.GLOBUS.COMMON",13,_C_d_SPARE, "C$SPARE");
/*   |   */        //    if (_C_d_SPARE.getNeedCommonInit()) DIM(_C_d_SPARE, 500 );
/*   |   */        //    _C_d_SPARE.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_R_VERSION == null) {
/*   |   */        //    _R_VERSION = session.getCommonNamed("THE.GLOBUS.COMMON",14,_R_VERSION, "R.VERSION");
/*   |   */        //    if (_R_VERSION.getNeedCommonInit()) DIM(_R_VERSION, 500 );
/*   |   */        //    _R_VERSION.setNeedCommonInit(false);
/*   |   */        //}
/*   |   */        //if (_A == null) {
/*   |   */        //   _A = session.getCommonNamed("THE.GLOBUS.COMMON",15, "A");
/*   |   */        //}
/*   |   */        //if (_AF == null) {
/*   |   */        //   _AF = session.getCommonNamed("THE.GLOBUS.COMMON",16, "AF");
/*   |   */        //}
/*   |   */        //if (_AUTH_NO == null) {
/*   |   */        //   _AUTH_NO = session.getCommonNamed("THE.GLOBUS.COMMON",17, "AUTH.NO");
/*   |   */        //}
/*   |   */        //if (_ANY_INPUT == null) {
/*   |   */        //   _ANY_INPUT = session.getCommonNamed("THE.GLOBUS.COMMON",18, "ANY.INPUT");
/*   |   */        //}
/*   |   */        //if (_APPLICATION == null) {
/*   |   */        //   _APPLICATION = session.getCommonNamed("THE.GLOBUS.COMMON",19, "APPLICATION");
/*   |   */        //}
/*   |   */        //if (_AS == null) {
/*   |   */        //   _AS = session.getCommonNamed("THE.GLOBUS.COMMON",20, "AS");
/*   |   */        //}
/*   |   */        //if (_F_JOURNAL == null) {
/*   |   */        //   _F_JOURNAL = session.getCommonNamed("THE.GLOBUS.COMMON",21, "F.JOURNAL");
/*   |   */        //}
/*   |   */        //if (_AUTH_QUALITY == null) {
/*   |   */        //   _AUTH_QUALITY = session.getCommonNamed("THE.GLOBUS.COMMON",22, "AUTH.QUALITY");
/*   |   */        //}
/*   |   */        //if (_AV == null) {
/*   |   */        //   _AV = session.getCommonNamed("THE.GLOBUS.COMMON",23, "AV");
/*   |   */        //}
/*   |   */        //if (_C == null) {
/*   |   */        //   _C = session.getCommonNamed("THE.GLOBUS.COMMON",24, "C");
/*   |   */        //}
/*   |   */        //if (_COMI == null) {
/*   |   */        //   _COMI = session.getCommonNamed("THE.GLOBUS.COMMON",25, "COMI");
/*   |   */        //}
/*   |   */        //if (_COMI_ENRI == null) {
/*   |   */        //   _COMI_ENRI = session.getCommonNamed("THE.GLOBUS.COMMON",26, "COMI.ENRI");
/*   |   */        //}
/*   |   */        //if (_CONTROLWORD_OK == null) {
/*   |   */        //   _CONTROLWORD_OK = session.getCommonNamed("THE.GLOBUS.COMMON",27, "CONTROLWORD.OK");
/*   |   */        //}
/*   |   */        //if (_PRT_PARAMS == null) {
/*   |   */        //   _PRT_PARAMS = session.getCommonNamed("THE.GLOBUS.COMMON",28, "PRT.PARAMS");
/*   |   */        //}
/*   |   */        //if (_V_d_DISPLAY == null) {
/*   |   */        //   _V_d_DISPLAY = session.getCommonNamed("THE.GLOBUS.COMMON",29, "V$DISPLAY");
/*   |   */        //}
/*   |   */        if (_E == null) {
/*   |   */           _E = session.getCommonNamed("THE.GLOBUS.COMMON",30, "E");
/*   |   */        }
/*   |   */        //if (_ECOMI == null) {
/*   |   */        //   _ECOMI = session.getCommonNamed("THE.GLOBUS.COMMON",31, "ECOMI");
/*   |   */        //}
/*   |   */        //if (_END_ERROR == null) {
/*   |   */        //   _END_ERROR = session.getCommonNamed("THE.GLOBUS.COMMON",32, "END.ERROR");
/*   |   */        //}
/*   |   */        //if (_ETEXT == null) {
/*   |   */        //   _ETEXT = session.getCommonNamed("THE.GLOBUS.COMMON",33, "ETEXT");
/*   |   */        //}
/*   |   */        //if (_FILE_TYPE == null) {
/*   |   */        //   _FILE_TYPE = session.getCommonNamed("THE.GLOBUS.COMMON",34, "FILE.TYPE");
/*   |   */        //}
/*   |   */        //if (_FULL_FNAME == null) {
/*   |   */        //   _FULL_FNAME = session.getCommonNamed("THE.GLOBUS.COMMON",35, "FULL.FNAME");
/*   |   */        //}
/*   |   */        //if (_V_d_FUNCTION == null) {
/*   |   */        //   _V_d_FUNCTION = session.getCommonNamed("THE.GLOBUS.COMMON",36, "V$FUNCTION");
/*   |   */        //}
/*   |   */        //if (_HIST_NO == null) {
/*   |   */        //   _HIST_NO = session.getCommonNamed("THE.GLOBUS.COMMON",37, "HIST.NO");
/*   |   */        //}
/*   |   */        //if (_ID_ALL == null) {
/*   |   */        //   _ID_ALL = session.getCommonNamed("THE.GLOBUS.COMMON",38, "ID.ALL");
/*   |   */        //}
/*   |   */        //if (_ID_AUT == null) {
/*   |   */        //   _ID_AUT = session.getCommonNamed("THE.GLOBUS.COMMON",39, "ID.AUT");
/*   |   */        //}
/*   |   */        //if (_ID_CHECKFILE == null) {
/*   |   */        //   _ID_CHECKFILE = session.getCommonNamed("THE.GLOBUS.COMMON",40, "ID.CHECKFILE");
/*   |   */        //}
/*   |   */        //if (_R_INTERCO_PARAMETER == null) {
/*   |   */        //   _R_INTERCO_PARAMETER = session.getCommonNamed("THE.GLOBUS.COMMON",41, "R.INTERCO.PARAMETER");
/*   |   */        //}
/*   |   */        //if (_ID_COMPANY == null) {
/*   |   */        //   _ID_COMPANY = session.getCommonNamed("THE.GLOBUS.COMMON",42, "ID.COMPANY");
/*   |   */        //}
/*   |   */        //if (_ID_CONCATFILE == null) {
/*   |   */        //   _ID_CONCATFILE = session.getCommonNamed("THE.GLOBUS.COMMON",43, "ID.CONCATFILE");
/*   |   */        //}
/*   |   */        //if (_ID_ENRI == null) {
/*   |   */        //   _ID_ENRI = session.getCommonNamed("THE.GLOBUS.COMMON",44, "ID.ENRI");
/*   |   */        //}
/*   |   */        //if (_ID_ETEXT == null) {
/*   |   */        //   _ID_ETEXT = session.getCommonNamed("THE.GLOBUS.COMMON",45, "ID.ETEXT");
/*   |   */        //}
/*   |   */        //if (_ID_F == null) {
/*   |   */        //   _ID_F = session.getCommonNamed("THE.GLOBUS.COMMON",46, "ID.F");
/*   |   */        //}
/*   |   */        //if (_ID_N == null) {
/*   |   */        //   _ID_N = session.getCommonNamed("THE.GLOBUS.COMMON",47, "ID.N");
/*   |   */        //}
/*   |   */        //if (_ID_NEW == null) {
/*   |   */        //   _ID_NEW = session.getCommonNamed("THE.GLOBUS.COMMON",48, "ID.NEW");
/*   |   */        //}
/*   |   */        //if (_ID_NEW_LAST == null) {
/*   |   */        //   _ID_NEW_LAST = session.getCommonNamed("THE.GLOBUS.COMMON",49, "ID.NEW.LAST");
/*   |   */        //}
/*   |   */        //if (_ID_OLD == null) {
/*   |   */        //   _ID_OLD = session.getCommonNamed("THE.GLOBUS.COMMON",50, "ID.OLD");
/*   |   */        //}
/*   |   */        //if (_ID_POINTER == null) {
/*   |   */        //   _ID_POINTER = session.getCommonNamed("THE.GLOBUS.COMMON",51, "ID.POINTER");
/*   |   */        //}
/*   |   */        //if (_ID_R == null) {
/*   |   */        //   _ID_R = session.getCommonNamed("THE.GLOBUS.COMMON",52, "ID.R");
/*   |   */        //}
/*   |   */        //if (_ID_T == null) {
/*   |   */        //   _ID_T = session.getCommonNamed("THE.GLOBUS.COMMON",53, "ID.T");
/*   |   */        //}
/*   |   */        //if (_JOURNAL_BYPASS == null) {
/*   |   */        //   _JOURNAL_BYPASS = session.getCommonNamed("THE.GLOBUS.COMMON",54, "JOURNAL.BYPASS");
/*   |   */        //}
/*   |   */        //if (_INPUT_BUFFER == null) {
/*   |   */        //   _INPUT_BUFFER = session.getCommonNamed("THE.GLOBUS.COMMON",55, "INPUT.BUFFER");
/*   |   */        //}
/*   |   */        //if (_L == null) {
/*   |   */        //   _L = session.getCommonNamed("THE.GLOBUS.COMMON",56, "L");
/*   |   */        //}
/*   |   */        //if (_L_MULTI == null) {
/*   |   */        //   _L_MULTI = session.getCommonNamed("THE.GLOBUS.COMMON",57, "L.MULTI");
/*   |   */        //}
/*   |   */        //if (_L1ST == null) {
/*   |   */        //   _L1ST = session.getCommonNamed("THE.GLOBUS.COMMON",58, "L1ST");
/*   |   */        //}
/*   |   */        //if (_LASTA == null) {
/*   |   */        //   _LASTA = session.getCommonNamed("THE.GLOBUS.COMMON",59, "LASTA");
/*   |   */        //}
/*   |   */        //if (_LASTL_MULTI == null) {
/*   |   */        //   _LASTL_MULTI = session.getCommonNamed("THE.GLOBUS.COMMON",60, "LASTL.MULTI");
/*   |   */        //}
/*   |   */        //if (_OVERRIDE_FLAG == null) {
/*   |   */        //   _OVERRIDE_FLAG = session.getCommonNamed("THE.GLOBUS.COMMON",61, "OVERRIDE.FLAG");
/*   |   */        //}
/*   |   */        //if (_LASTP == null) {
/*   |   */        //   _LASTP = session.getCommonNamed("THE.GLOBUS.COMMON",62, "LASTP");
/*   |   */        //}
/*   |   */        //if (_LCCY == null) {
/*   |   */        //   _LCCY = session.getCommonNamed("THE.GLOBUS.COMMON",63, "LCCY");
/*   |   */        //}
/*   |   */        //if (_LEVEL_NO == null) {
/*   |   */        //   _LEVEL_NO = session.getCommonNamed("THE.GLOBUS.COMMON",64, "LEVEL.NO");
/*   |   */        //}
/*   |   */        //if (_LEVEL_STATUS == null) {
/*   |   */        //   _LEVEL_STATUS = session.getCommonNamed("THE.GLOBUS.COMMON",65, "LEVEL.STATUS");
/*   |   */        //}
/*   |   */        //if (_LNGG == null) {
/*   |   */        //   _LNGG = session.getCommonNamed("THE.GLOBUS.COMMON",66, "LNGG");
/*   |   */        //}
/*   |   */        //if (_LOCAL_REF_FIELD == null) {
/*   |   */        //   _LOCAL_REF_FIELD = session.getCommonNamed("THE.GLOBUS.COMMON",67, "LOCAL.REF.FIELD");
/*   |   */        //}
/*   |   */        //if (_MESSAGE == null) {
/*   |   */        //   _MESSAGE = session.getCommonNamed("THE.GLOBUS.COMMON",68, "MESSAGE");
/*   |   */        //}
/*   |   */        //if (_MULTI_POSSIBLE == null) {
/*   |   */        //   _MULTI_POSSIBLE = session.getCommonNamed("THE.GLOBUS.COMMON",69, "MULTI.POSSIBLE");
/*   |   */        //}
/*   |   */        //if (_MTHPOS == null) {
/*   |   */        //   _MTHPOS = session.getCommonNamed("THE.GLOBUS.COMMON",70, "MTHPOS");
/*   |   */        //}
/*   |   */        //if (_OPERATOR == null) {
/*   |   */        //   _OPERATOR = session.getCommonNamed("THE.GLOBUS.COMMON",71, "OPERATOR");
/*   |   */        //}
/*   |   */        //if (_OPF_NO == null) {
/*   |   */        //   _OPF_NO = session.getCommonNamed("THE.GLOBUS.COMMON",72, "OPF.NO");
/*   |   */        //}
/*   |   */        //if (_P == null) {
/*   |   */        //   _P = session.getCommonNamed("THE.GLOBUS.COMMON",73, "P");
/*   |   */        //}
/*   |   */        //if (_PGM_TYPE == null) {
/*   |   */        //   _PGM_TYPE = session.getCommonNamed("THE.GLOBUS.COMMON",74, "PGM.TYPE");
/*   |   */        //}
/*   |   */        //if (_PGM_TYPE_NEXT == null) {
/*   |   */        //   _PGM_TYPE_NEXT = session.getCommonNamed("THE.GLOBUS.COMMON",75, "PGM.TYPE.NEXT");
/*   |   */        //}
/*   |   */        //if (_PGM_VERSION == null) {
/*   |   */        //   _PGM_VERSION = session.getCommonNamed("THE.GLOBUS.COMMON",76, "PGM.VERSION");
/*   |   */        //}
/*   |   */        //if (_PHNO == null) {
/*   |   */        //   _PHNO = session.getCommonNamed("THE.GLOBUS.COMMON",77, "PHNO");
/*   |   */        //}
/*   |   */        //if (_PREFIX == null) {
/*   |   */        //   _PREFIX = session.getCommonNamed("THE.GLOBUS.COMMON",78, "PREFIX");
/*   |   */        //}
/*   |   */        //if (_PRINTER_STATUS == null) {
/*   |   */        //   _PRINTER_STATUS = session.getCommonNamed("THE.GLOBUS.COMMON",79, "PRINTER.STATUS");
/*   |   */        //}
/*   |   */        //if (_RETURN_COMI == null) {
/*   |   */        //   _RETURN_COMI = session.getCommonNamed("THE.GLOBUS.COMMON",80, "RETURN.COMI");
/*   |   */        //}
/*   |   */        //if (_SCREEN_MODE == null) {
/*   |   */        //   _SCREEN_MODE = session.getCommonNamed("THE.GLOBUS.COMMON",81, "SCREEN.MODE");
/*   |   */        //}
/*   |   */        //if (_SCREEN_TITLE == null) {
/*   |   */        //   _SCREEN_TITLE = session.getCommonNamed("THE.GLOBUS.COMMON",82, "SCREEN.TITLE");
/*   |   */        //}
/*   |   */        //if (_T_OV_CLASS == null) {
/*   |   */        //   _T_OV_CLASS = session.getCommonNamed("THE.GLOBUS.COMMON",83, "T.OV.CLASS");
/*   |   */        //}
/*   |   */        //if (_TEXT == null) {
/*   |   */        //   _TEXT = session.getCommonNamed("THE.GLOBUS.COMMON",84, "TEXT");
/*   |   */        //}
/*   |   */        //if (_TIME_STAMP == null) {
/*   |   */        //   _TIME_STAMP = session.getCommonNamed("THE.GLOBUS.COMMON",85, "TIME.STAMP");
/*   |   */        //}
/*   |   */        //if (_TNO == null) {
/*   |   */        //   _TNO = session.getCommonNamed("THE.GLOBUS.COMMON",86, "TNO");
/*   |   */        //}
/*   |   */        //if (_TODAY == null) {
/*   |   */        //   _TODAY = session.getCommonNamed("THE.GLOBUS.COMMON",87, "TODAY");
/*   |   */        //}
/*   |   */        //if (_R_ACCOUNT_PARAMETER == null) {
/*   |   */        //   _R_ACCOUNT_PARAMETER = session.getCommonNamed("THE.GLOBUS.COMMON",88, "R.ACCOUNT.PARAMETER");
/*   |   */        //}
/*   |   */        //if (_TTYPE == null) {
/*   |   */        //   _TTYPE = session.getCommonNamed("THE.GLOBUS.COMMON",89, "TTYPE");
/*   |   */        //}
/*   |   */        //if (_V == null) {
/*   |   */        //   _V = session.getCommonNamed("THE.GLOBUS.COMMON",90, "V");
/*   |   */        //}
/*   |   */        //if (_VAL_TEXT == null) {
/*   |   */        //   _VAL_TEXT = session.getCommonNamed("THE.GLOBUS.COMMON",91, "VAL.TEXT");
/*   |   */        //}
/*   |   */        //if (_T_AUTH_PAGE == null) {
/*   |   */        //   _T_AUTH_PAGE = session.getCommonNamed("THE.GLOBUS.COMMON",92, "T.AUTH.PAGE");
/*   |   */        //}
/*   |   */        //if (_R_SPF_SYSTEM == null) {
/*   |   */        //   _R_SPF_SYSTEM = session.getCommonNamed("THE.GLOBUS.COMMON",93, "R.SPF.SYSTEM");
/*   |   */        //}
/*   |   */        //if (_T_CAT == null) {
/*   |   */        //   _T_CAT = session.getCommonNamed("THE.GLOBUS.COMMON",94, "T.CAT");
/*   |   */        //}
/*   |   */        //if (_T_CCY == null) {
/*   |   */        //   _T_CCY = session.getCommonNamed("THE.GLOBUS.COMMON",95, "T.CCY");
/*   |   */        //}
/*   |   */        //if (_CLEAR_SCREEN == null) {
/*   |   */        //   _CLEAR_SCREEN = session.getCommonNamed("THE.GLOBUS.COMMON",96, "CLEAR.SCREEN");
/*   |   */        //}
/*   |   */        //if (_T_CONTROLWORD == null) {
/*   |   */        //   _T_CONTROLWORD = session.getCommonNamed("THE.GLOBUS.COMMON",97, "T.CONTROLWORD");
/*   |   */        //}
/*   |   */        //if (_T_ENRI == null) {
/*   |   */        //   _T_ENRI = session.getCommonNamed("THE.GLOBUS.COMMON",98, "T.ENRI");
/*   |   */        //}
/*   |   */        //if (_T_ETEXT == null) {
/*   |   */        //   _T_ETEXT = session.getCommonNamed("THE.GLOBUS.COMMON",99, "T.ETEXT");
/*   |   */        //}
/*   |   */        //if (_T_FIELDNO == null) {
/*   |   */        //   _T_FIELDNO = session.getCommonNamed("THE.GLOBUS.COMMON",100, "T.FIELDNO");
/*   |   */        //}
/*   |   */        //if (_T_FUNCTION == null) {
/*   |   */        //   _T_FUNCTION = session.getCommonNamed("THE.GLOBUS.COMMON",101, "T.FUNCTION");
/*   |   */        //}
/*   |   */        //if (_T_LANGUAGE == null) {
/*   |   */        //   _T_LANGUAGE = session.getCommonNamed("THE.GLOBUS.COMMON",102, "T.LANGUAGE");
/*   |   */        //}
/*   |   */        //if (_FILE_CLASS == null) {
/*   |   */        //   _FILE_CLASS = session.getCommonNamed("THE.GLOBUS.COMMON",103, "FILE.CLASS");
/*   |   */        //}
/*   |   */        //if (_CACHE_OFF == null) {
/*   |   */        //   _CACHE_OFF = session.getCommonNamed("THE.GLOBUS.COMMON",104, "CACHE.OFF");
/*   |   */        //}
/*   |   */        //if (_T_LOCREF == null) {
/*   |   */        //   _T_LOCREF = session.getCommonNamed("THE.GLOBUS.COMMON",105, "T.LOCREF");
/*   |   */        //}
/*   |   */        //if (_T_MTH == null) {
/*   |   */        //   _T_MTH = session.getCommonNamed("THE.GLOBUS.COMMON",106, "T.MTH");
/*   |   */        //}
/*   |   */        //if (_T_MTH_DAY == null) {
/*   |   */        //   _T_MTH_DAY = session.getCommonNamed("THE.GLOBUS.COMMON",107, "T.MTH.DAY");
/*   |   */        //}
/*   |   */        //if (_T_MULTI_PAGE == null) {
/*   |   */        //   _T_MULTI_PAGE = session.getCommonNamed("THE.GLOBUS.COMMON",108, "T.MULTI.PAGE");
/*   |   */        //}
/*   |   */        //if (_F_SPF == null) {
/*   |   */        //   _F_SPF = session.getCommonNamed("THE.GLOBUS.COMMON",109, "F.SPF");
/*   |   */        //}
/*   |   */        //if (_CONTROL_MODULO == null) {
/*   |   */        //   _CONTROL_MODULO = session.getCommonNamed("THE.GLOBUS.COMMON",110, "CONTROL.MODULO");
/*   |   */        //}
/*   |   */        //if (_LEVELS_NOT_ALLOWED == null) {
/*   |   */        //   _LEVELS_NOT_ALLOWED = session.getCommonNamed("THE.GLOBUS.COMMON",111, "LEVELS.NOT.ALLOWED");
/*   |   */        //}
/*   |   */        //if (_T_MULTI_TEXT == null) {
/*   |   */        //   _T_MULTI_TEXT = session.getCommonNamed("THE.GLOBUS.COMMON",112, "T.MULTI.TEXT");
/*   |   */        //}
/*   |   */        //if (_LIMIT_NETTING_IND == null) {
/*   |   */        //   _LIMIT_NETTING_IND = session.getCommonNamed("THE.GLOBUS.COMMON",113, "LIMIT.NETTING.IND");
/*   |   */        //}
/*   |   */        //if (_T_OPF == null) {
/*   |   */        //   _T_OPF = session.getCommonNamed("THE.GLOBUS.COMMON",114, "T.OPF");
/*   |   */        //}
/*   |   */        //if (_T_PWD == null) {
/*   |   */        //   _T_PWD = session.getCommonNamed("THE.GLOBUS.COMMON",115, "T.PWD");
/*   |   */        //}
/*   |   */        //if (_T_PWP == null) {
/*   |   */        //   _T_PWP = session.getCommonNamed("THE.GLOBUS.COMMON",116, "T.PWP");
/*   |   */        //}
/*   |   */        //if (_T_RAT == null) {
/*   |   */        //   _T_RAT = session.getCommonNamed("THE.GLOBUS.COMMON",117, "T.RAT");
/*   |   */        //}
/*   |   */        //if (_T_RETURN_DATA == null) {
/*   |   */        //   _T_RETURN_DATA = session.getCommonNamed("THE.GLOBUS.COMMON",118, "T.RETURN.DATA");
/*   |   */        //}
/*   |   */        //if (_T_SEQU == null) {
/*   |   */        //   _T_SEQU = session.getCommonNamed("THE.GLOBUS.COMMON",119, "T.SEQU");
/*   |   */        //}
/*   |   */        //if (_T_SUB_ASSOC == null) {
/*   |   */        //   _T_SUB_ASSOC = session.getCommonNamed("THE.GLOBUS.COMMON",120, "T.SUB.ASSOC");
/*   |   */        //}
/*   |   */        //if (_BATCH_DETAILS == null) {
/*   |   */        //   _BATCH_DETAILS = session.getCommonNamed("THE.GLOBUS.COMMON",121, "BATCH.DETAILS");
/*   |   */        //}
/*   |   */        //if (_T_TRS == null) {
/*   |   */        //   _T_TRS = session.getCommonNamed("THE.GLOBUS.COMMON",122, "T.TRS");
/*   |   */        //}
/*   |   */        //if (_CACHE_TEXT_TABLE == null) {
/*   |   */        //   _CACHE_TEXT_TABLE = session.getCommonNamed("THE.GLOBUS.COMMON",123, "CACHE.TEXT.TABLE");
/*   |   */        //}
/*   |   */        //if (_F_ACTIVITY == null) {
/*   |   */        //   _F_ACTIVITY = session.getCommonNamed("THE.GLOBUS.COMMON",124, "F.ACTIVITY");
/*   |   */        //}
/*   |   */        //if (_F_FILE == null) {
/*   |   */        //   _F_FILE = session.getCommonNamed("THE.GLOBUS.COMMON",125, "F.FILE");
/*   |   */        //}
/*   |   */        //if (_F_FILE_d_HIS == null) {
/*   |   */        //   _F_FILE_d_HIS = session.getCommonNamed("THE.GLOBUS.COMMON",126, "F.FILE$HIS");
/*   |   */        //}
/*   |   */        //if (_F_FILE_d_NAU == null) {
/*   |   */        //   _F_FILE_d_NAU = session.getCommonNamed("THE.GLOBUS.COMMON",127, "F.FILE$NAU");
/*   |   */        //}
/*   |   */        //if (_F_LOCKING == null) {
/*   |   */        //   _F_LOCKING = session.getCommonNamed("THE.GLOBUS.COMMON",128, "F.LOCKING");
/*   |   */        //}
/*   |   */        //if (_F_PROTOCOL == null) {
/*   |   */        //   _F_PROTOCOL = session.getCommonNamed("THE.GLOBUS.COMMON",129, "F.PROTOCOL");
/*   |   */        //}
/*   |   */        //if (_F_CURRENCY == null) {
/*   |   */        //   _F_CURRENCY = session.getCommonNamed("THE.GLOBUS.COMMON",130, "F.CURRENCY");
/*   |   */        //}
/*   |   */        //if (_LIVE_RECORD_MANDATORY == null) {
/*   |   */        //   _LIVE_RECORD_MANDATORY = session.getCommonNamed("THE.GLOBUS.COMMON",131, "LIVE.RECORD.MANDATORY");
/*   |   */        //}
/*   |   */        //if (_LANG_NO == null) {
/*   |   */        //   _LANG_NO = session.getCommonNamed("THE.GLOBUS.COMMON",132, "LANG.NO");
/*   |   */        //}
/*   |   */        //if (_F_DYNAMIC_TEXT == null) {
/*   |   */        //   _F_DYNAMIC_TEXT = session.getCommonNamed("THE.GLOBUS.COMMON",133, "F.DYNAMIC.TEXT");
/*   |   */        //}
/*   |   */        //if (_F_STATIC_TEXT == null) {
/*   |   */        //   _F_STATIC_TEXT = session.getCommonNamed("THE.GLOBUS.COMMON",134, "F.STATIC.TEXT");
/*   |   */        //}
/*   |   */        //if (_F_FILE_CONTROL == null) {
/*   |   */        //   _F_FILE_CONTROL = session.getCommonNamed("THE.GLOBUS.COMMON",135, "F.FILE.CONTROL");
/*   |   */        //}
/*   |   */        //if (_T_VAL_ASSOC == null) {
/*   |   */        //   _T_VAL_ASSOC = session.getCommonNamed("THE.GLOBUS.COMMON",136, "T.VAL.ASSOC");
/*   |   */        //}
/*   |   */        //if (_LOCAL1 == null) {
/*   |   */        //   _LOCAL1 = session.getCommonNamed("THE.GLOBUS.COMMON",137, "LOCAL1");
/*   |   */        //}
/*   |   */        //if (_LOCAL2 == null) {
/*   |   */        //   _LOCAL2 = session.getCommonNamed("THE.GLOBUS.COMMON",138, "LOCAL2");
/*   |   */        //}
/*   |   */        //if (_LOCAL3 == null) {
/*   |   */        //   _LOCAL3 = session.getCommonNamed("THE.GLOBUS.COMMON",139, "LOCAL3");
/*   |   */        //}
/*   |   */        //if (_LOCAL4 == null) {
/*   |   */        //   _LOCAL4 = session.getCommonNamed("THE.GLOBUS.COMMON",140, "LOCAL4");
/*   |   */        //}
/*   |   */        //if (_LOCAL5 == null) {
/*   |   */        //   _LOCAL5 = session.getCommonNamed("THE.GLOBUS.COMMON",141, "LOCAL5");
/*   |   */        //}
/*   |   */        //if (_LOCAL6 == null) {
/*   |   */        //   _LOCAL6 = session.getCommonNamed("THE.GLOBUS.COMMON",142, "LOCAL6");
/*   |   */        //}
/*   |   */        //if (_LOCAL7 == null) {
/*   |   */        //   _LOCAL7 = session.getCommonNamed("THE.GLOBUS.COMMON",143, "LOCAL7");
/*   |   */        //}
/*   |   */        //if (_LOCAL8 == null) {
/*   |   */        //   _LOCAL8 = session.getCommonNamed("THE.GLOBUS.COMMON",144, "LOCAL8");
/*   |   */        //}
/*   |   */        //if (_F_IDS_LATEST == null) {
/*   |   */        //   _F_IDS_LATEST = session.getCommonNamed("THE.GLOBUS.COMMON",145, "F.IDS.LATEST");
/*   |   */        //}
/*   |   */        //if (_RUNNING_UNDER_BATCH == null) {
/*   |   */        //   _RUNNING_UNDER_BATCH = session.getCommonNamed("THE.GLOBUS.COMMON",146, "RUNNING.UNDER.BATCH");
/*   |   */        //}
/*   |   */        //if (_T_DEF_BASE == null) {
/*   |   */        //   _T_DEF_BASE = session.getCommonNamed("THE.GLOBUS.COMMON",147, "T.DEF.BASE");
/*   |   */        //}
/*   |   */        //if (_T_DEF_BASE_TARGET == null) {
/*   |   */        //   _T_DEF_BASE_TARGET = session.getCommonNamed("THE.GLOBUS.COMMON",148, "T.DEF.BASE.TARGET");
/*   |   */        //}
/*   |   */        //if (_COMI_DEFAULT == null) {
/*   |   */        //   _COMI_DEFAULT = session.getCommonNamed("THE.GLOBUS.COMMON",149, "COMI.DEFAULT");
/*   |   */        //}
/*   |   */        //if (_CMD_d_STACK == null) {
/*   |   */        //   _CMD_d_STACK = session.getCommonNamed("THE.GLOBUS.COMMON",150, "CMD$STACK");
/*   |   */        //}
/*   |   */        //if (_T_SELECT == null) {
/*   |   */        //   _T_SELECT = session.getCommonNamed("THE.GLOBUS.COMMON",151, "T.SELECT");
/*   |   */        //}
/*   |   */        //if (_LINK_DATA == null) {
/*   |   */        //   _LINK_DATA = session.getCommonNamed("THE.GLOBUS.COMMON",152, "LINK.DATA");
/*   |   */        //}
/*   |   */        //if (_WRITE_CACHE == null) {
/*   |   */        //   _WRITE_CACHE = session.getCommonNamed("THE.GLOBUS.COMMON",153, "WRITE.CACHE");
/*   |   */        //}
/*   234 */        /* ************************************************************************ */
/*   235 */        /*  GB9400200 */
/*   |   */        //if (_R_USER == null) {
/*   |   */        //   _R_USER = session.getCommonNamed("GLOBUS1",0, "R.USER");
/*   |   */        //}
/*   |   */        //if (_C_d_INT_MOVEMENT_PARAM == null) {
/*   |   */        //   _C_d_INT_MOVEMENT_PARAM = session.getCommonNamed("GLOBUS1",1, "C$INT.MOVEMENT.PARAM");
/*   |   */        //}
/*   |   */        //if (_R_BANK_RETURN_PARAMS == null) {
/*   |   */        //   _R_BANK_RETURN_PARAMS = session.getCommonNamed("GLOBUS1",2, "R.BANK.RETURN.PARAMS");
/*   |   */        //}
/*   |   */        //if (_C_d__UNIVERSE_RELEASE == null) {
/*   |   */        //   _C_d__UNIVERSE_RELEASE = session.getCommonNamed("GLOBUS1",3, "C$.UNIVERSE.RELEASE");
/*   |   */        //}
/*   |   */        //if (_C_d__USE_CCY_CACHE == null) {
/*   |   */        //   _C_d__USE_CCY_CACHE = session.getCommonNamed("GLOBUS1",4, "C$.USE.CCY.CACHE");
/*   |   */        //}
/*   |   */        //if (_C_d_R_LCCY == null) {
/*   |   */        //   _C_d_R_LCCY = session.getCommonNamed("GLOBUS1",5, "C$R.LCCY");
/*   |   */        //}
/*   |   */        //if (_C_d_BA_PARAMETER == null) {
/*   |   */        //   _C_d_BA_PARAMETER = session.getCommonNamed("GLOBUS1",6, "C$BA.PARAMETER");
/*   |   */        //}
/*   |   */        //if (_C_d_EB_PHANTOM_ID == null) {
/*   |   */        //   _C_d_EB_PHANTOM_ID = session.getCommonNamed("GLOBUS1",7, "C$EB.PHANTOM.ID");
/*   |   */        //}
/*   |   */        //if (_C_d_PC_CLOSING_DATE == null) {
/*   |   */        //   _C_d_PC_CLOSING_DATE = session.getCommonNamed("GLOBUS1",8, "C$PC.CLOSING.DATE");
/*   |   */        //}
/*   |   */        if (_RUNNING_IN_JBASE == null) {
/*   |   */           _RUNNING_IN_JBASE = session.getCommonNamed("GLOBUS1",9, "RUNNING.IN.JBASE");
/*   |   */        }
/*   |   */        //if (_USING_EBCDIC == null) {
/*   |   */        //   _USING_EBCDIC = session.getCommonNamed("GLOBUS1",10, "USING.EBCDIC");
/*   |   */        //}
/*   |   */        //if (_C_d_SEQX == null) {
/*   |   */        //   _C_d_SEQX = session.getCommonNamed("GLOBUS1",11, "C$SEQX");
/*   |   */        //}
/*   |   */        //if (_RUNNING_IN_UTF8 == null) {
/*   |   */        //   _RUNNING_IN_UTF8 = session.getCommonNamed("GLOBUS1",12, "RUNNING.IN.UTF8");
/*   |   */        //}
/*   |   */        //if (_C_d_MULTI_BOOK == null) {
/*   |   */        //   _C_d_MULTI_BOOK = session.getCommonNamed("GLOBUS1",13, "C$MULTI.BOOK");
/*   |   */        //}
/*   |   */        //if (_C_d_FUNCTION_LIST == null) {
/*   |   */        //   _C_d_FUNCTION_LIST = session.getCommonNamed("GLOBUS1",14, "C$FUNCTION.LIST");
/*   |   */        //}
/*   |   */        //if (_C_d_COMP_EOD_LIST == null) {
/*   |   */        //   _C_d_COMP_EOD_LIST = session.getCommonNamed("GLOBUS1",15, "C$COMP.EOD.LIST");
/*   |   */        //}
/*   |   */        //if (_C_d_APP_STORE_DATA == null) {
/*   |   */        //   _C_d_APP_STORE_DATA = session.getCommonNamed("GLOBUS1",16, "C$APP.STORE.DATA");
/*   |   */        //}
/*   |   */        //if (_C_d_DE_EU_LIST == null) {
/*   |   */        //   _C_d_DE_EU_LIST = session.getCommonNamed("GLOBUS1",17, "C$DE.EU.LIST");
/*   |   */        //}
/*   |   */        //if (_SENSITIVITY == null) {
/*   |   */        //   _SENSITIVITY = session.getCommonNamed("GLOBUS1",18, "SENSITIVITY");
/*   |   */        //}
/*   |   */        //if (_T_OPF_MAX == null) {
/*   |   */        //   _T_OPF_MAX = session.getCommonNamed("GLOBUS1",19, "T.OPF.MAX");
/*   |   */        //}
/*   |   */        //if (_T_OPF_FN == null) {
/*   |   */        //   _T_OPF_FN = session.getCommonNamed("GLOBUS1",20, "T.OPF.FN");
/*   |   */        //}
/*   |   */        //if (_T_OPF_FC == null) {
/*   |   */        //   _T_OPF_FC = session.getCommonNamed("GLOBUS1",21, "T.OPF.FC");
/*   |   */        //}
/*   |   */        //if (_C_d_NS_OPERATION == null) {
/*   |   */        //   _C_d_NS_OPERATION = session.getCommonNamed("GLOBUS1",22, "C$NS.OPERATION");
/*   |   */        //}
  // EN_10002238 S/E
/*   |   */        //if (_USER_DATE_FORMAT == null) {
/*   |   */        //   _USER_DATE_FORMAT = session.getCommonNamed("GLOBUS1",23, "USER.DATE.FORMAT");
/*   |   */        //}
/*   |   */        //if (_V_d_ACTION == null) {
/*   |   */        //   _V_d_ACTION = session.getCommonNamed("GLOBUS1",24, "V$ACTION");
/*   |   */        //}
/*   |   */        //if (_C_d_ACTION_DETAIL == null) {
/*   |   */        //   _C_d_ACTION_DETAIL = session.getCommonNamed("GLOBUS1",25, "C$ACTION.DETAIL");
/*   |   */        //}
/*   |   */        //if (_C_d_SC_FEE_RECALC == null) {
/*   |   */        //   _C_d_SC_FEE_RECALC = session.getCommonNamed("GLOBUS1",26, "C$SC.FEE.RECALC");
/*   |   */        //}
/*   |   */        //if (_C_d_T24_SESSION_NO == null) {
/*   |   */        //   _C_d_T24_SESSION_NO = session.getCommonNamed("GLOBUS1",27, "C$T24.SESSION.NO");
/*   |   */        //}
/*   |   */        //if (_F_T24_SESSION == null) {
/*   |   */        //   _F_T24_SESSION = session.getCommonNamed("GLOBUS1",28, "F.T24.SESSION");
/*   |   */        //}
/*   |   */        //if (_C_d_PORT_NO == null) {
/*   |   */        //   _C_d_PORT_NO = session.getCommonNamed("GLOBUS1",29, "C$PORT.NO");
/*   |   */        //}
/*   |   */        //if (_C_d_USE_T24_LOG == null) {
/*   |   */        //   _C_d_USE_T24_LOG = session.getCommonNamed("GLOBUS1",30, "C$USE.T24.LOG");
/*   |   */        //}
/*   |   */        //if (_USER_ROLE == null) {
/*   |   */        //   _USER_ROLE = session.getCommonNamed("GLOBUS1",31, "USER.ROLE");
/*   |   */        //}
/*   |   */        //if (_RUNNING_IN_TAFJ == null) {
/*   |   */        //   _RUNNING_IN_TAFJ = session.getCommonNamed("GLOBUS1",32, "RUNNING.IN.TAFJ");
/*   |   */        //}
/*   |   */        //if (_DEADLOCK_REC == null) {
/*   |   */        //   _DEADLOCK_REC = session.getCommonNamed("GLOBUS1",33, "DEADLOCK.REC");
/*   |   */        //}
/*   |   */        //if (_DEADLOCK_TXN == null) {
/*   |   */        //   _DEADLOCK_TXN = session.getCommonNamed("GLOBUS1",34, "DEADLOCK.TXN");
/*   |   */        //}
/*   |   */        //if (_DEADLOCK_KEY == null) {
/*   |   */        //   _DEADLOCK_KEY = session.getCommonNamed("GLOBUS1",35, "DEADLOCK.KEY");
/*   |   */        //}
/*   |   */        //if (_C_d_DIGITAL_SIGNATURE == null) {
/*   |   */        //   _C_d_DIGITAL_SIGNATURE = session.getCommonNamed("GLOBUS1",36, "C$DIGITAL.SIGNATURE");
/*   |   */        //}
/*   |   */        //if (_C_d_DS_RULE_DATA == null) {
/*   |   */        //   _C_d_DS_RULE_DATA = session.getCommonNamed("GLOBUS1",37, "C$DS.RULE.DATA");
/*   |   */        //}
/*   |   */        //if (_C_d_MESSAGE_TOKEN == null) {
/*   |   */        //   _C_d_MESSAGE_TOKEN = session.getCommonNamed("GLOBUS1",38, "C$MESSAGE.TOKEN");
/*   |   */        //}
/*   |   */        //if (_C_d_CACHE_RESET_PERIOD == null) {
/*   |   */        //   _C_d_CACHE_RESET_PERIOD = session.getCommonNamed("GLOBUS1",39, "C$CACHE.RESET.PERIOD");
/*   |   */        //}
/*   |   */        //if (_C_d_CACHE_RESET_REQUIRED == null) {
/*   |   */        //   _C_d_CACHE_RESET_REQUIRED = session.getCommonNamed("GLOBUS1",40, "C$CACHE.RESET.REQUIRED");
/*   |   */        //}
/*   |   */        //if (_C_d_DB_LOCKING_MODE == null) {
/*   |   */        //   _C_d_DB_LOCKING_MODE = session.getCommonNamed("GLOBUS1",41, "C$DB.LOCKING.MODE");
/*   |   */        //}
/*   |   */        //if (_C_d_LAST_CR_ITERATION_UTC == null) {
/*   |   */        //   _C_d_LAST_CR_ITERATION_UTC = session.getCommonNamed("GLOBUS1",42, "C$LAST.CR.ITERATION.UTC");
/*   |   */        //}
/*   |   */        //if (_C_d_PREVIOUS_CR_PERIOD == null) {
/*   |   */        //   _C_d_PREVIOUS_CR_PERIOD = session.getCommonNamed("GLOBUS1",43, "C$PREVIOUS.CR.PERIOD");
/*   |   */        //}
/*   |   */        //if (_C_d_RETAIN_ALT_CONCAT == null) {
/*   |   */        //   _C_d_RETAIN_ALT_CONCAT = session.getCommonNamed("GLOBUS1",44, "C$RETAIN.ALT.CONCAT");
/*   |   */        //}
/*   |   */        //if (_G_SPARE6 == null) {
/*   |   */        //   _G_SPARE6 = session.getCommonNamed("GLOBUS1",45, "G.SPARE6");
/*   |   */        //}
/*   |   */        //if (_G_SPARE5 == null) {
/*   |   */        //   _G_SPARE5 = session.getCommonNamed("GLOBUS1",46, "G.SPARE5");
/*   |   */        //}
/*   |   */        //if (_G_SPARE4 == null) {
/*   |   */        //   _G_SPARE4 = session.getCommonNamed("GLOBUS1",47, "G.SPARE4");
/*   |   */        //}
/*   |   */        //if (_G_SPARE3 == null) {
/*   |   */        //   _G_SPARE3 = session.getCommonNamed("GLOBUS1",48, "G.SPARE3");
/*   |   */        //}
/*   |   */        //if (_G_SPARE2 == null) {
/*   |   */        //   _G_SPARE2 = session.getCommonNamed("GLOBUS1",49, "G.SPARE2");
/*   |   */        //}
/*   |   */        //if (_G_SPARE1 == null) {
/*   |   */        //   _G_SPARE1 = session.getCommonNamed("GLOBUS1",50, "G.SPARE1");
/*   |   */        //}
/*   246 */        /* ************************************************************************ */
/*   |   */        //if (_C_d_CHARX == null) {
/*   |   */        //    _C_d_CHARX = session.getCommonNamed("ASCIIEBCIDIC",0,_C_d_CHARX, "C$CHARX");
/*   |   */        //    if (_C_d_CHARX.getNeedCommonInit()) DIM(_C_d_CHARX, 255 );
/*   |   */        //    _C_d_CHARX.setNeedCommonInit(false);
/*   |   */        //}
_l(   249,"I_COMMON",false);        set(_PASSED_NO, "");  //  GB0001258
_l(   250,"I_COMMON",false);        set(_PASSED_CHAR, "");  //  GB0001258
_l(   251,"I_COMMON",false);        // DEFFUN SEQX(PASSED.CHAR)  //  GB0000709
_l(   252,"I_COMMON",false);        // DEFFUN CHARX(PASSED.NO)  //  GB0001078
_l(   253,"I_COMMON",false);        // DEFFUN CHARSX(PASSED.NO)  //  GB0001702
_l(   254,"I_COMMON",false);        // DEFFUN SEQSX(PASSED.CHAR)  //  GB0001702
/*   255 */        /* *********************************************************************** */
_l(   256,"I_COMMON",false);        if (boolVal(_RUNNING_IN_JBASE))
/*   |   */        {  //  GB0002667
_l(   257,"I_COMMON",false);            PRECISION(13);  //  GLOBUS_EN_10000172 S/E
/*   |   */        }
/*   |   */        else {
_l(   258,"I_COMMON",false);             // ELSE
_l(   259,"I_COMMON",false);            PRECISION(6);
/*   |   */        }
_l(   260,"I_COMMON",false);         //ENDIF
/*   |   */        /* *********************************************************************** */
/*   262 *//*   |   */        return 0;
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    public int INSERT__I__EQUATE(){
/*     1 */        /*  Version 19 18/10/00  GLOBUS Release No. G13.1.00 31/10/02 */
/*     2 */        /*  "I_EQUATE",840421-001 * INSERT EQUATE */
/*     3 */        /*  */
/*     4 */        /*  C a u t i o n :   After a change of this routine, don't forget to */
/*     5 */        /*                    move it to RG.BP for use of report generator */
/*     6 */        /*  */
/*     7 */        /* ************************************************************************ */
/*     8 */        /*  */
/*     9 */        /*  CHANGE CONTROL */
/*    10 */        /*  -------------- */
/*    11 */        /*  */
/*    12 */        /*  27/03/00 - GB0000605 */
/*    13 */        /*             Subroutines will be called by their name directly. */
/*    14 */        /*  */
/*    15 */        /* 23/08/00 - GB0002067 GB0002667 */
/*    16 */        /*            If RUNNING.IN.JBASE then the precision is set as 9. */
/*    17 */        /*            But do this in I_COMMON otherwise you force the order */
/*    18 */        /*            of EQUATE & COMMON. */
/*    19 */        /* ************************************************************************ */
/*    20 */        /*  */
/*    21 */        /*  Common Area for function key values */
/*    22 */        /*  */
/*   |   */        //if (_C_U == null) {
/*   |   */        //   _C_U = session.getCommonNamed("FNKEYS",0, "C.U");
/*   |   */        //}
/*   |   */        //if (_C_B == null) {
/*   |   */        //   _C_B = session.getCommonNamed("FNKEYS",1, "C.B");
/*   |   */        //}
/*   |   */        //if (_C_F == null) {
/*   |   */        //   _C_F = session.getCommonNamed("FNKEYS",2, "C.F");
/*   |   */        //}
/*   |   */        //if (_C_E == null) {
/*   |   */        //   _C_E = session.getCommonNamed("FNKEYS",3, "C.E");
/*   |   */        //}
/*   |   */        //if (_C_V == null) {
/*   |   */        //   _C_V = session.getCommonNamed("FNKEYS",4, "C.V");
/*   |   */        //}
/*   |   */        //if (_C_W == null) {
/*   |   */        //   _C_W = session.getCommonNamed("FNKEYS",5, "C.W");
/*   |   */        //}
/*   |   */        //if (_C_T == null) {
/*   |   */        //   _C_T = session.getCommonNamed("FNKEYS",6, "C.T");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY8 == null) {
/*   |   */        //   _SPARE_FKEY8 = session.getCommonNamed("FNKEYS",7, "SPARE.FKEY8");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY9 == null) {
/*   |   */        //   _SPARE_FKEY9 = session.getCommonNamed("FNKEYS",8, "SPARE.FKEY9");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY10 == null) {
/*   |   */        //   _SPARE_FKEY10 = session.getCommonNamed("FNKEYS",9, "SPARE.FKEY10");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY11 == null) {
/*   |   */        //   _SPARE_FKEY11 = session.getCommonNamed("FNKEYS",10, "SPARE.FKEY11");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY12 == null) {
/*   |   */        //   _SPARE_FKEY12 = session.getCommonNamed("FNKEYS",11, "SPARE.FKEY12");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY13 == null) {
/*   |   */        //   _SPARE_FKEY13 = session.getCommonNamed("FNKEYS",12, "SPARE.FKEY13");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY14 == null) {
/*   |   */        //   _SPARE_FKEY14 = session.getCommonNamed("FNKEYS",13, "SPARE.FKEY14");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY15 == null) {
/*   |   */        //   _SPARE_FKEY15 = session.getCommonNamed("FNKEYS",14, "SPARE.FKEY15");
/*   |   */        //}
/*   |   */        //if (_SPARE_FKEY16 == null) {
/*   |   */        //   _SPARE_FKEY16 = session.getCommonNamed("FNKEYS",15, "SPARE.FKEY16");
/*   |   */        //}
/*    27 */        /*  */
/*   |   */        /* MACRO : _C_PRINT EQU TO : CHAR(1)*/ 
/*    29 */        /*  Key (control-A) to print screen display, when used in action line */
/*    30 */        /* ------------------------------------------------------------------------ */
/*   |   */        /* MACRO : _FM EQU TO : jAtVariable.FM*/ 
/*   |   */        /* MACRO : _VM EQU TO : jAtVariable.VM*/ 
/*   |   */        /* MACRO : _SM EQU TO : jAtVariable.SM*/ 
/*    34 */        /* ------------------------------------------------------------------------ */
/*   |   */        /* MACRO : _NOTNUMERIC EQU TO : 0*/ 
/*   |   */        /* MACRO : _NUMERIC EQU TO : 1*/ 
/*   |   */        /* MACRO : _OTHERWISE EQU TO : 1*/ 
/*    38 */        /* --------------------------------------------------------------------- */
/*   |   */        /* MACRO : _RCOL EQU TO : 1*/ 
/*    40 */        /*  = R(x)-Index for COLumn number */
/*   |   */        /* MACRO : _RLIN EQU TO : 2*/ 
/*    42 */        /*  = R(x)-Index for LINe number */
/*   |   */        /* MACRO : _RTXT EQU TO : 3*/ 
/*    44 */        /*  = R(x)-Index for TeXT */
/*   |   */        /* MACRO : _RELN EQU TO : 4*/ 
/*    46 */        /*  = R(x)-Index for Enrichment LeNgth */
/*   |   */        /* MACRO : _RFLN EQU TO : 5*/ 
/*    48 */        /*  = R(x)-Index for Field LeNgth */
/*    49 */        /* ************************************************************************ */
/*    50 *//*   |   */        return 0;
/*   |   */    }
/*   |   */    
/*   |   */    
/*   |   */    
/*   |   */    //Variables
/*   |   */    public jVar _PASSED_CHAR;
/*   |   */    public jVar _R_NEW;
/*   |   */    public jVar _P1;
/*   |   */    public jVar _FT_CREDIT_AMOUNT;
/*   |   */    public jVar _RUNNING_IN_JBASE;
/*   |   */    public jVar _PASSED_NO;
/*   |   */    public jVar _E;
/*   |   */    
/*   |   */    // init method.
/*   |   */    public void init(jSession _s_ ) {
/*   |   */        super.init(_s_);
/*   |   */        
/*   |   */        if (_NeedInitialise_){
/*   |   */            create();
/*   |   */            initComponents(_s_);
/*   |   */        }else{
/*   |   */            reset();
/*   |   */        }
/*   |   */    }
/*   |   */    
/*   |   */    private void initComponents(jSession _s_){ 
/*   |   */        FT_Validation = (component_FT_Validation_18_cl) _s_.getComponentCache("FT.Validation");
/*   |   */        if (FT_Validation== null) {
/*   |   */            FT_Validation= _s_.putComponentInCache("FT.Validation", new component_FT_Validation_18_cl(_s_));
/*   |   */        }
/*   |   */    }
/*   |   */    public String[] getComponentList(){ 
/*   |   */       if (_componentList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _componentList_ = new String[2];
/*   |   */          _componentList_[0] = "FT.Validation";
/*   |   */       }
/*   |   */       return _componentList_;
/*   |   */    }
/*   |   */    
/*   |   */    // create method.
/*   |   */    public void create() {
/*   |   */        _PASSED_CHAR = jVarFactory.get();
/*   |   */        _FT_CREDIT_AMOUNT = jVarFactory.get();
/*   |   */        _PASSED_NO = jVarFactory.get();
/*   |   */    }
/*   |   */    
/*   |   */    // reset method.
/*   |   */    public void reset() {
/*   |   */        _PASSED_CHAR.reset();
/*   |   */        _FT_CREDIT_AMOUNT.reset();
/*   |   */        _PASSED_NO.reset();
/*   |   */    }
/*   |   */    
/*   |   */    public void CLEAR() {
/*   |   */        _file0001.CLEAR();
/*   |   */        _PASSED_CHAR.CLEAR();
/*   |   */        _P1.CLEAR();
/*   |   */        _FT_CREDIT_AMOUNT.CLEAR();
/*   |   */        _PASSED_NO.CLEAR();
/*   |   */    }
/*   |   */    
/*   |   */    public void release() {
/*   |   */        //UNMAT
/*   |   */        
/*   |   */        //RELEASE
/*   |   */        _PASSED_CHAR.release();
/*   |   */        _FT_CREDIT_AMOUNT.release();
/*   |   */        _PASSED_NO.release();
/*   |   */    }
/*   |   */    
/*   |   */    //Gosub
/*   |   */    protected void GOSUB(int nLabel) {
/*   |   */        GOSUB(nLabel, true);
/*   |   */    }
/*   |   */    
/*   |   */    protected void GOSUB(int nLabel, boolean checkCallStack) {
/*   |   */        int nRet = LABEL_NULL;
/*   |   */        if (checkCallStack){
/*   |   */            try{
/*   |   */                checkCallStack("-gs:" + getLabelName(nLabel));
/*   |   */            }catch(Exception e){
/*   |   */                session.setStateSubroutine(STATE_EXIT);
/*   |   */                nLabel = LABEL_EXIT;
/*   |   */                nRet = LABEL_EXIT;
/*   |   */            }
/*   |   */        }
/*   |   */        switch(nLabel){
/*   |   */        case main:
/*   |   */            nRet = main();
/*   |   */            break;
/*   |   */        default:
/*   |   */        }
/*   |   */        check(nRet);
/*   |   */    }
/*   |   */    
/*   |   */    //CB
/*   |   */    protected void CB(int sNext) {
/*   |   */        GOSUB(sNext, false);
/*   |   */    }
/*   |   */    
/*   |   */    //Flags
/*   |   */    
/*   |   */    //Labels
/*   |   */    protected final static int LABEL_EXIT = -3;
/*   |   */    protected final static int LABEL_STOP = -2;
/*   |   */    protected final static int LABEL_NULL = -1;
/*   |   */    protected final static int main = 0;
/*   |   */    
/*   |   */    //Only for callstack comparison
/*   |   */    private String getLabelName(int nLabel){
/*   |   */        return "";
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the unitTest Framework needs to know what variables are in this program.
/*   |   */    public String[] getParamList(){
/*   |   */       if (_paramList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _paramList_ = new String[1];
/*   |   */          _paramList_[0] = "P1";
/*   |   */       }
/*   |   */       return _paramList_;
/*   |   */    }
/*   |   */    public jVar[] getParams(){
/*   |   */        return new jVar[]{
/*   |   */    _P1/*   |   */    
/*   |   */       };
/*   |   */    }
/*   |   */    
/*   |   */    // Invoked whenever the unitTest Framework needs to know what variables are in this program.
/*   |   */    public static String[] getParamListStatic(){
/*   |   */       if (_paramList_ == null){
/*   |   */          //Initialize the list
/*   |   */          _paramList_ = new String[1];
/*   |   */          _paramList_[0] = "P1";
/*   |   */       }
/*   |   */       return _paramList_;
/*   |   */    }
/*   |   */    
/*   |   */    //For Sanity Check
/*   |   */    public static String[] getDependenciesStatic(){
/*   |   */        String ret[] = new String[4];
/*   |   */        ret[0] = "SEQSX";
/*   |   */        ret[1] = "CHARX";
/*   |   */        ret[2] = "CHARSX";
/*   |   */        ret[3] = "SEQX";
/*   |   */        return ret;
/*   |   */    }
/*   |   */    
/*   |   */    //For Debugger and tShow
/*   |   */    public String getPathFileNameBasic(){
/*   |   */        return "C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\V.FT.VALIDATION.b";
/*   |   */    }
/*   |   */    
/*   |   */    //static method
/*   |   */    public static String getPathFileNameBasicStatic(){
/*   |   */        return "C:\\Temenos\\R18\\Env\\Slot01\\Products\\DesignStudio\\GitHub_3\\ft-modelbank-data-code\\src\\Source\\Private\\FT_Modelbank\\V.FT.VALIDATION.b";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getCompileInfo() {
/*   |   */        return "1542794198461	21 Nov 2018 10:56:38	PC-LU-0057	3";
/*   |   */    }
/*   |   */    
/*   |   */    // static method
/*   |   */    public static String getCompileInfoStatic() {
/*   |   */        return "1542794198461	21 Nov 2018 10:56:38	PC-LU-0057	3";
/*   |   */    }
/*   |   */    
/*   |   */    //For tShow
/*   |   */    public String getPackageBasic() {
/*   |   */        return "FT.Validation";
/*   |   */    }
/*   |   */    
/*   |   */    // No need to instanciate the class to get it
/*   |   */    public static String getPackageBasicStatic() {
/*   |   */        return "FT.Validation";
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
/*   |   */
/*   |   */}

