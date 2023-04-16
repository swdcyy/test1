package eg2.a;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2Model;
import java.util.List;
import java.lang.Integer;
import o56.a;
import java.util.Random;
import java.util.Collections;
import com.kuaishou.protobuf.livestream.nano.LiveQuiz2Proto$LiveQuiz2OptionWithStat;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a	// class@002721
{
    public String a;
    public String b;
    public float c;
    public String d;
    public boolean e;

    public void a(){
       super();
    }
    public static a a(LiveQuiz2Proto$LiveQuiz2OptionModel p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.a = p0.id;
       obj.b = p0.body;
       return obj;
    }
    public static boolean b(LiveQuiz2Proto$LiveQuiz2Model p0){
       boolean b = (p0 != null && p0.optionShuffleType == 2)? true: false;
       return b;
    }
    public static void c(int p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "5")) {
          return;
       }
       Collections.shuffle(p1, new Random((long)((p0 ^ (a.a).hashCode()) ^ (a.j).hashCode())));
       return;
    }
    public void d(LiveQuiz2Proto$LiveQuiz2OptionWithStat p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (TextUtils.x(this.a)) {
          LiveQuiz2Proto$LiveQuiz2OptionWithStat option = p0.option;
          this.a = option.id;
          this.b = option.body;
       }
       this.c = p0.voteRate;
       this.d = p0.voteCount;
       return;
    }
}
