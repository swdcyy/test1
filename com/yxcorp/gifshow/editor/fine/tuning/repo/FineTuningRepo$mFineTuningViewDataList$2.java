package com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo$mFineTuningViewDataList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.common.collect.ImmutableList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.ImmutableList$a;
import gca.c;
import com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import com.google.common.collect.Range;
import wba.q;
import java.lang.Comparable;
import java.lang.Number;
import com.kuaishou.edit.draft.FineTuningParam;
import hca.a;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.framework.abtest.f;

public final class FineTuningRepo$mFineTuningViewDataList$2 extends Lambda implements a	// class@001ba9
{
    public static final FineTuningRepo$mFineTuningViewDataList$2 INSTANCE;

    static {
       FineTuningRepo$mFineTuningViewDataList$2.INSTANCE = new FineTuningRepo$mFineTuningViewDataList$2();
    }
    public void FineTuningRepo$mFineTuningViewDataList$2(){
       super(0);
    }
    public final ImmutableList invoke(){
       c uoc5;
       ImmutableList$a obj = PatchProxy.apply(null, this, FineTuningRepo$mFineTuningViewDataList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ImmutableList.builder();
       c uoc = new c(EditorFineTuningType.BRIGHTNESS_TYPE, 0x7f101631, 0x7f080c4e, (int)q.d().lowerEndpoint().floatValue(), (int)q.d().upperEndpoint().floatValue(), (int)a.a().getBrightness());
       obj.h(v1);
       c uoc1 = new c(EditorFineTuningType.CONTRAST_TYPE, 0x7f101633, 0x7f080c50, (int)q.f().lowerEndpoint().floatValue(), (int)q.f().upperEndpoint().floatValue(), (int)a.a().getContrast());
       obj.h(v1);
       c uoc2 = new c(EditorFineTuningType.SATURATION_TYPE, 0x7f101635, 0x7f080c51, (int)q.h().lowerEndpoint().floatValue(), (int)q.h().upperEndpoint().floatValue(), (int)a.a().getSaturation());
       obj.h(v1);
       c uoc3 = new c(EditorFineTuningType.COLOR_TEMPERATURE_TYPE, 0x7f101637, 0x7f080c4f, (int)q.k().lowerEndpoint().floatValue(), (int)q.k().upperEndpoint().floatValue(), (int)a.a().getColorTemperature());
       obj.h(v1);
       c uoc4 = new c(EditorFineTuningType.SHARPEN_TYPE, 0x7f101636, 0x7f080c52, (int)q.j().lowerEndpoint().floatValue(), (int)q.j().upperEndpoint().floatValue(), (int)a.a().getSharpen());
       obj.h(v1);
       String str = "ClarityPicture";
       if (a.a().c()) {
          uoc5 = (l.c("KEY_ENABLE_CLARITY_PICTURE", false))? 1: f.a(str);
       }else {
          uoc5 = f.a(str);
       }
       if (uoc5) {
          uoc = new c(EditorFineTuningType.CLARITY_TYPE, 0x7f101632, 0x7f081c8a, (int)q.e().lowerEndpoint().floatValue(), (int)q.e().upperEndpoint().floatValue(), (int)a.a().getClarity());
          obj.h(uoc5);
       }
       return obj.i();
    }
    public Object invoke(){
       return this.invoke();
    }
}
