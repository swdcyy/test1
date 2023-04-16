package com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireInfo;
import com.kuaishou.live.lite.questionnaire.LiveLiteQuestionnaireInfo$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveLiteQuestionnaireInfo	// class@000aa5
{
    public final long displayDuration;
    public final String id;
    public final List options;
    public final String questionId;
    public final String subBizType;
    public final String title;
    public static final LiveLiteQuestionnaireInfo$a a;

    static {
       LiveLiteQuestionnaireInfo.a = new LiveLiteQuestionnaireInfo$a(null);
    }
    public void LiveLiteQuestionnaireInfo(){
       ArrayList uArrayList = new ArrayList();
       a.p("", "subBizType");
       a.p("", "id");
       a.p("", "questionId");
       a.p("", "title");
       a.p(uArrayList, "options");
       super();
       this.subBizType = "";
       this.id = "";
       this.questionId = "";
       this.title = "";
       this.options = uArrayList;
       this.displayDuration = 0;
    }
    public final long a(){
       return this.displayDuration;
    }
    public final String b(){
       return this.id;
    }
    public final List c(){
       return this.options;
    }
    public final String d(){
       return this.questionId;
    }
    public final String e(){
       return this.subBizType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteQuestionnaireInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveLiteQuestionnaireInfo && (a.g(this.subBizType, p0.subBizType) && (a.g(this.id, p0.id) && (a.g(this.questionId, p0.questionId) && (a.g(this.title, p0.title) && (a.g(this.options, p0.options) && !this.displayDuration - p0.displayDuration))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.title;
    }
    public int hashCode(){
       LiveLiteQuestionnaireInfo obj = PatchProxy.apply(null, this, LiveLiteQuestionnaireInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.subBizType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveLiteQuestionnaireInfo tid = this.id;
       int i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.questionId;
       i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.title;
       i2 = (tid != null)? tid.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tid = this.options;
       if (tid != null) {
          i = tid.hashCode();
       }
       LiveLiteQuestionnaireInfo tdisplayDura = this.displayDuration;
       return (((i1 + i) * 31) + (int)(tdisplayDura ^ (tdisplayDura >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuestionnaireInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveLiteQuestionnaireInfo\(subBizType=\'"+this.subBizType+"\', id=\'"+this.id+"\', questionId=\'"+this.questionId+"\', title=\'"+this.title+"\', options="+this.options+", displayDuration="+this.displayDuration+')';
    }
}
