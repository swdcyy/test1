package eg2.b;
import java.lang.Object;
import java.util.ArrayList;
import p91.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import bg2.c;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2RevivedCountInfo;
import java.util.Collection;
import ekd.q;
import eg2.a;
import java.util.List;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionWithStat;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import java.util.Iterator;
import java.lang.StringBuilder;

public class b	// class@002722
{
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public String f;
    public boolean g;
    public List h;
    public long i;
    public String j;
    public String k;
    public boolean l;
    public long m;
    public long n;
    public String o;

    public void b(){
       super();
       this.a = 0;
       this.h = new ArrayList();
    }
    public long a(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = this.c - c.e(p0);
       long l1 = 0;
       if (l - l1 < 0) {
          return l1;
       }
       return Math.min(l, this.b());
    }
    public long b(){
       return (this.c - this.b);
    }
    public long c(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = this.e - c.e(p0);
       long l1 = 0;
       if (l - l1 < 0) {
          return l1;
       }
       return Math.min(l, (this.e - this.d));
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(this.k) ^ 0x01);
    }
    public boolean e(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.d() && TextUtils.equals(this.j, this.k))? true: false;
       return b;
    }
    public void f(byte[] p0,LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed p1){
       String str;
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "5")) {
          return;
       }
       if (this.a == null) {
          this.a = p1.questionNumber;
       }
       this.d = p1.reviewStartTime;
       this.e = p1.reviewEndTime;
       this.f = p1.title;
       this.k = p1.correctOptionId;
       this.m = p1.requestAfterAnswerMaxDelayMs;
       this.n = p1.requestAfterAnswerMinDelayMs;
       LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed revivedCount = p1.revivedCountInfo;
       if (revivedCount != null) {
          this.o = revivedCount.revivedCount;
       }
       int i = 0;
       if (q.f(this.h)) {
          ArrayList uArrayList = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "6");
          if (uArrayList != PatchProxyResult.class) {
          }else if(p0 != null){
             str = c.b(p0, p1.eraserErrorAnswer);
          }else {
             str = "";
          }
          uArrayList = new ArrayList();
          LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed optionWithSt = p1.optionWithStat;
          int len = optionWithSt.length;
          for (; i < len; i = i + 1) {
             object oobject = optionWithSt[i];
             a uoa = PatchProxy.applyOneRefs(oobject, null, a.class, "2");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = a.a(oobject.option);
                uoa.d(oobject);
             }
             if (!TextUtils.x(str) && (uoa.a).equals(str)) {
                uoa.e = true;
             }
             uArrayList.add(uoa);
          }
          if (a.b(p1.liveQuiz)) {
             a.c(p1.questionNumber, uArrayList);
          }
          this.h = uArrayList;
       }else {
          LiveQuiz2Proto$SCLiveQuiz2QuestionReviewed optionWithSt1 = p1.optionWithStat;
          int len1 = optionWithSt1.length;
          while (i < len1) {
             object oobject1 = optionWithSt1[i];
             Iterator iterator = this.h.iterator();
             while (iterator.hasNext()) {
                a uoa1 = iterator.next();
                a = uoa1.a;
                LiveQuiz2Proto$LiveQuiz2OptionModel id = oobject1.option.id;
                if (!TextUtils.isEmpty(a) && TextUtils.equals(a, id)) {
                   uoa1.d(oobject1);
                }
             }
             i = i + 1;
          }
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveQuizAudienceQuestion{mQuestionIndex="+this.a+", mQuestionStartTimeMs="+this.b+", mQuestionEndTimeMs="+this.c+", mReviewStartTimeMs="+this.d+", mReviewEndTimeMs="+this.e+", mTitle=\'"+this.f+'''+", mOptions="+this.h+", mSubmitMaxDelayMs="+this.i+", mMyOptionId=\'"+this.j+'''+", mCorrectOptionId=\'"+this.k+'''+", mIsSubmitOptionSuccess="+this.l+", mRequestAwardMaxDelayMs="+this.m+", mRequestAwardMinDelayMs="+this.n+'}';
    }
}
