package com.kwai.feature.api.pendant.core.model.ChangeWidgetStatusBtnConfig$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ChangeWidgetStatusBtnConfig$Status extends Enum	// class@001030
{
    public static final ChangeWidgetStatusBtnConfig$Status[] $VALUES;
    public static final ChangeWidgetStatusBtnConfig$Status CLOSE;
    public static final ChangeWidgetStatusBtnConfig$Status NOT_SHOW;
    public static final ChangeWidgetStatusBtnConfig$Status OPEN;

    static {
       ChangeWidgetStatusBtnConfig$Status status;
       ChangeWidgetStatusBtnConfig$Status[] statusArray = new ChangeWidgetStatusBtnConfig$Status[]{status,status,status};
       status = new ChangeWidgetStatusBtnConfig$Status("NOT_SHOW", 0);
       ChangeWidgetStatusBtnConfig$Status.NOT_SHOW = status;
       status = new ChangeWidgetStatusBtnConfig$Status("OPEN", 1);
       ChangeWidgetStatusBtnConfig$Status.OPEN = status;
       status = new ChangeWidgetStatusBtnConfig$Status("CLOSE", 2);
       ChangeWidgetStatusBtnConfig$Status.CLOSE = status;
       ChangeWidgetStatusBtnConfig$Status.$VALUES = statusArray;
    }
    public void ChangeWidgetStatusBtnConfig$Status(String p0,int p1){
       super(p0, p1);
    }
    public static ChangeWidgetStatusBtnConfig$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ChangeWidgetStatusBtnConfig$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ChangeWidgetStatusBtnConfig$Status.class, p0);
    }
    public static ChangeWidgetStatusBtnConfig$Status[] values(){
       Object obj = PatchProxy.apply(null, null, ChangeWidgetStatusBtnConfig$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ChangeWidgetStatusBtnConfig$Status.$VALUES.clone();
    }
}
