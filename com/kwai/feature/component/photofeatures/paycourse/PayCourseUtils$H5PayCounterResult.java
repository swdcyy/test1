package com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils$H5PayCounterResult;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PayCourseUtils$H5PayCounterResult extends Enum	// class@001226
{
    public String message;
    public String url;
    public final int value;
    public static final PayCourseUtils$H5PayCounterResult[] $VALUES;
    public static final PayCourseUtils$H5PayCounterResult FAIL;
    public static final PayCourseUtils$H5PayCounterResult OTHER;
    public static final PayCourseUtils$H5PayCounterResult SUCCESS;
    public static final PayCourseUtils$H5PayCounterResult TOSERVICE;

    static {
       PayCourseUtils$H5PayCounterResult h5PayCounter1;
       PayCourseUtils$H5PayCounterResult[] h5PayCounter = new PayCourseUtils$H5PayCounterResult[]{v9,h5PayCounter1,h5PayCounter1,h5PayCounter1};
       h5PayCounter1 = new PayCourseUtils$H5PayCounterResult("SUCCESS", 0, 1, null, null, 6, null);
       PayCourseUtils$H5PayCounterResult.SUCCESS = v9;
       PayCourseUtils$H5PayCounterResult h5PayCounter2 = new PayCourseUtils$H5PayCounterResult("FAIL", 1, 2, null, null, 6, null);
       PayCourseUtils$H5PayCounterResult.FAIL = h5PayCounter1;
       PayCourseUtils$H5PayCounterResult h5PayCounter3 = new PayCourseUtils$H5PayCounterResult("OTHER", 2, 3, null, null, 6, null);
       PayCourseUtils$H5PayCounterResult.OTHER = h5PayCounter1;
       h5PayCounter3 = new PayCourseUtils$H5PayCounterResult("TOSERVICE", 3, 4, null, null, 6, null);
       PayCourseUtils$H5PayCounterResult.TOSERVICE = h5PayCounter1;
       PayCourseUtils$H5PayCounterResult.$VALUES = h5PayCounter;
    }
    public void PayCourseUtils$H5PayCounterResult(String p0,int p1,int p2,String p3,String p4){
       super(p0, p1);
       this.value = p2;
       this.url = p3;
       this.message = p4;
    }
    public void PayCourseUtils$H5PayCounterResult(String p0,int p1,int p2,String p3,String p4,int p5,u p6){
       String str = (p5 & 0x02)? "": p3;
       String str1 = (p5 & 0x04)? "": p4;
       super(p0, p1, p2, str, str1);
       return;
    }
    public static PayCourseUtils$H5PayCounterResult valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PayCourseUtils$H5PayCounterResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PayCourseUtils$H5PayCounterResult.class, p0);
    }
    public static PayCourseUtils$H5PayCounterResult[] values(){
       Object obj = PatchProxy.apply(null, null, PayCourseUtils$H5PayCounterResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PayCourseUtils$H5PayCounterResult.$VALUES.clone();
    }
    public final String getMessage(){
       return this.message;
    }
    public final String getUrl(){
       return this.url;
    }
    public final int getValue(){
       return this.value;
    }
    public final void setMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayCourseUtils$H5PayCounterResult.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.message = p0;
       return;
    }
    public final void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayCourseUtils$H5PayCounterResult.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.url = p0;
       return;
    }
}
