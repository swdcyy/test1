package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$ForwardListType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ForwardGridSectionRefactorFragment$ForwardListType extends Enum	// class@001cd4
{
    public static final ForwardGridSectionRefactorFragment$ForwardListType[] $VALUES;
    public static final ForwardGridSectionRefactorFragment$ForwardListType FUNCTION;
    public static final ForwardGridSectionRefactorFragment$ForwardListType INAPP;
    public static final ForwardGridSectionRefactorFragment$ForwardListType PLATFORM;

    static {
       ForwardGridSectionRefactorFragment$ForwardListType uForwardList1;
       ForwardGridSectionRefactorFragment$ForwardListType[] uForwardList = new ForwardGridSectionRefactorFragment$ForwardListType[]{uForwardList1,uForwardList1,uForwardList1};
       uForwardList1 = new ForwardGridSectionRefactorFragment$ForwardListType("INAPP", 0);
       ForwardGridSectionRefactorFragment$ForwardListType.INAPP = uForwardList1;
       uForwardList1 = new ForwardGridSectionRefactorFragment$ForwardListType("PLATFORM", 1);
       ForwardGridSectionRefactorFragment$ForwardListType.PLATFORM = uForwardList1;
       uForwardList1 = new ForwardGridSectionRefactorFragment$ForwardListType("FUNCTION", 2);
       ForwardGridSectionRefactorFragment$ForwardListType.FUNCTION = uForwardList1;
       ForwardGridSectionRefactorFragment$ForwardListType.$VALUES = uForwardList;
    }
    public void ForwardGridSectionRefactorFragment$ForwardListType(String p0,int p1){
       super(p0, p1);
    }
    public static ForwardGridSectionRefactorFragment$ForwardListType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ForwardGridSectionRefactorFragment$ForwardListType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ForwardGridSectionRefactorFragment$ForwardListType.class, p0);
    }
    public static ForwardGridSectionRefactorFragment$ForwardListType[] values(){
       Object obj = PatchProxy.apply(null, null, ForwardGridSectionRefactorFragment$ForwardListType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ForwardGridSectionRefactorFragment$ForwardListType.$VALUES.clone();
    }
}
