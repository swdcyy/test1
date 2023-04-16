package com.kwaishou.merchant.troubleshooting.core.TroubleShooting$ReportConfig;
import java.io.Serializable;
import java.lang.Object;

public final class TroubleShooting$ReportConfig implements Serializable	// class@001348
{
    public boolean isAllOnlineMode;
    public boolean isOpenOpt;
    public int reportMode;
    public boolean sameMerge;
    public int singleMsgLength;
    public int singleNodeUnImportantLogMaxNum;
    public int singleParamsValueLength;
    public int unImportantLogMaxLength;

    public void TroubleShooting$ReportConfig(){
       super();
       this.singleParamsValueLength = 500;
       this.singleMsgLength = 1000;
       this.singleNodeUnImportantLogMaxNum = 5;
       this.unImportantLogMaxLength = 100;
    }
    public final int getReportMode(){
       return this.reportMode;
    }
    public final boolean getSameMerge(){
       return this.sameMerge;
    }
    public final int getSingleMsgLength(){
       return this.singleMsgLength;
    }
    public final int getSingleNodeUnImportantLogMaxNum(){
       return this.singleNodeUnImportantLogMaxNum;
    }
    public final int getSingleParamsValueLength(){
       return this.singleParamsValueLength;
    }
    public final int getUnImportantLogMaxLength(){
       return this.unImportantLogMaxLength;
    }
    public final boolean isAllOnlineMode(){
       return this.isAllOnlineMode;
    }
    public final boolean isOpenOpt(){
       return this.isOpenOpt;
    }
    public final void setAllOnlineMode(boolean p0){
       this.isAllOnlineMode = p0;
    }
    public final void setOpenOpt(boolean p0){
       this.isOpenOpt = p0;
    }
    public final void setReportMode(int p0){
       this.reportMode = p0;
    }
    public final void setSameMerge(boolean p0){
       this.sameMerge = p0;
    }
    public final void setSingleMsgLength(int p0){
       this.singleMsgLength = p0;
    }
    public final void setSingleNodeUnImportantLogMaxNum(int p0){
       this.singleNodeUnImportantLogMaxNum = p0;
    }
    public final void setSingleParamsValueLength(int p0){
       this.singleParamsValueLength = p0;
    }
    public final void setUnImportantLogMaxLength(int p0){
       this.unImportantLogMaxLength = p0;
    }
}
