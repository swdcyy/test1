package com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ReEditCoverPresenter$Action extends Enum	// class@0013a0
{
    public static final ReEditCoverPresenter$Action[] $VALUES;
    public static final ReEditCoverPresenter$Action DISCARD;
    public static final ReEditCoverPresenter$Action SAVE;

    static {
       ReEditCoverPresenter$Action uAction = new ReEditCoverPresenter$Action("SAVE", 0);
       ReEditCoverPresenter$Action.SAVE = uAction;
       ReEditCoverPresenter$Action uAction1 = new ReEditCoverPresenter$Action("DISCARD", 1);
       ReEditCoverPresenter$Action.DISCARD = uAction1;
       ReEditCoverPresenter$Action[] uActionArray = new ReEditCoverPresenter$Action[]{uAction,uAction1};
       ReEditCoverPresenter$Action.$VALUES = uActionArray;
    }
    public void ReEditCoverPresenter$Action(String p0,int p1){
       super(p0, p1);
    }
    public static ReEditCoverPresenter$Action valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReEditCoverPresenter$Action.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ReEditCoverPresenter$Action.class, p0);
    }
    public static ReEditCoverPresenter$Action[] values(){
       Object obj = PatchProxy.apply(null, null, ReEditCoverPresenter$Action.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReEditCoverPresenter$Action.$VALUES.clone();
    }
}
