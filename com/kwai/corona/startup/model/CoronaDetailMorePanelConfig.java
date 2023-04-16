package com.kwai.corona.startup.model.CoronaDetailMorePanelConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public final class CoronaDetailMorePanelConfig implements Serializable	// class@000ced
{
    public boolean enteredCoronaTvTab;
    public ArrayList operations;
    public String sharePanelBackup;

    public void CoronaDetailMorePanelConfig(){
       super();
    }
    public final boolean getEnteredCoronaTvTab(){
       return this.enteredCoronaTvTab;
    }
    public final ArrayList getOperations(){
       return this.operations;
    }
    public final String getSharePanelBackup(){
       return this.sharePanelBackup;
    }
    public final void setEnteredCoronaTvTab(boolean p0){
       this.enteredCoronaTvTab = p0;
    }
    public final void setOperations(ArrayList p0){
       this.operations = p0;
    }
    public final void setSharePanelBackup(String p0){
       this.sharePanelBackup = p0;
    }
}
