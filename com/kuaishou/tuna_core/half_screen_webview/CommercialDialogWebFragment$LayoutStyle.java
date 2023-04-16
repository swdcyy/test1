package com.kuaishou.tuna_core.half_screen_webview.CommercialDialogWebFragment$LayoutStyle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommercialDialogWebFragment$LayoutStyle extends Enum	// class@0010c1
{
    public static final CommercialDialogWebFragment$LayoutStyle[] $VALUES;
    public static final CommercialDialogWebFragment$LayoutStyle STYLE_DEFAULT;
    public static final CommercialDialogWebFragment$LayoutStyle STYLE_ROUND_CORNER;

    static {
       CommercialDialogWebFragment$LayoutStyle layoutStyle = new CommercialDialogWebFragment$LayoutStyle("STYLE_DEFAULT", 0);
       CommercialDialogWebFragment$LayoutStyle.STYLE_DEFAULT = layoutStyle;
       CommercialDialogWebFragment$LayoutStyle layoutStyle1 = new CommercialDialogWebFragment$LayoutStyle("STYLE_ROUND_CORNER", 1);
       CommercialDialogWebFragment$LayoutStyle.STYLE_ROUND_CORNER = layoutStyle1;
       CommercialDialogWebFragment$LayoutStyle[] layoutStyleA = new CommercialDialogWebFragment$LayoutStyle[]{layoutStyle,layoutStyle1};
       CommercialDialogWebFragment$LayoutStyle.$VALUES = layoutStyleA;
    }
    public void CommercialDialogWebFragment$LayoutStyle(String p0,int p1){
       super(p0, p1);
    }
    public static CommercialDialogWebFragment$LayoutStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommercialDialogWebFragment$LayoutStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommercialDialogWebFragment$LayoutStyle.class, p0);
    }
    public static CommercialDialogWebFragment$LayoutStyle[] values(){
       Object obj = PatchProxy.apply(null, null, CommercialDialogWebFragment$LayoutStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommercialDialogWebFragment$LayoutStyle.$VALUES.clone();
    }
}
