package kaa.b;
import kaa.w;
import jaa.d;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.InternalFeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import jaa.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.Cover$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b extends w	// class@002c24
{
    public final d a;
    public FeatureId b;
    public FeatureId c;

    public void b(){
       super();
       this.a = new d(1, 3, 2);
       FeatureId$b uob = FeatureId.newBuilder();
       uob.b(InternalFeatureId.TEXT_BUBBLE_ID_DATE);
       this.b = uob.build();
       uob = FeatureId.newBuilder();
       uob.b(InternalFeatureId.TEXT_BANNER_ROUND_RED);
       this.c = uob.build();
    }
    public d a(){
       return this.a;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.b(p0);
       c a = p0.a;
       a.f("Android");
       int i = 0;
       while (i < p0.a.getTextsCount()) {
          Text texts = a.getTexts(i);
          if (this.c(texts)) {
             a.s(i, this.d(texts));
          }
          i = i + 1;
       }
       for (i = 0; i < p0.a.getCoversCount(); i = i + 1) {
          Cover$b uob = a.getCovers(i).toBuilder();
          int i1 = 0;
          while (i1 < uob.instance.getTextsCount()) {
             Text texts1 = uob.instance.getTexts(i1);
             if (this.c(texts1)) {
                uob.g(i, this.d(texts1));
             }
             i1 = i1 + 1;
          }
          a.j(i, uob);
       }
       return;
    }
    public final boolean c(Text p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       f.D().s("Migrator132", "isTextBubbleIdDate textFeaturedId:"+p0.getFeatureId(), objArray);
       if (!DraftUtils.m(this.c, p0.getFeatureId())) {
          return i;
       }
       objArray = new Object[i];
       f.D().s("Migrator132", "isTextBubbleIdDate textTimeText:"+p0.getTimeText()+",textAuthorText:"+p0.getAuthorText(), objArray);
       if (!TextUtils.isEmpty(p0.getTimeText()) && !TextUtils.isEmpty(p0.getAuthorText())) {
          i = true;
       }
       return i;
    }
    public final Text$b d(Text p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Text$b uob = p0.toBuilder();
       uob.h(this.b);
       return uob;
    }
}
