package com.kuaishou.merchant.actionreport.model.ReportActionItem;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public final class ReportActionItem implements Serializable	// class@0014d9
{
    public int actionType;
    public List pendants;

    public void ReportActionItem(){
       super();
       this.pendants = new ArrayList();
    }
    public final int getActionType(){
       return this.actionType;
    }
    public final List getPendants(){
       return this.pendants;
    }
    public final void setActionType(int p0){
       this.actionType = p0;
    }
    public final void setPendants(List p0){
       this.pendants = p0;
    }
}
