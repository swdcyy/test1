package b57.a;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.kwai.live.gzone.emotion.module.a;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import com.kwai.emotionsdk.bean.EmotionPackage;

public class a implements a	// class@0003c6
{
    public List mEmotionList;
    public EmotionPackage mEmotionPackageInfo;

    public void a(){
       super();
    }
    public void afterDeserialize(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       a tmEmotionPac = this.mEmotionPackageInfo;
       a tmEmotionLis = this.mEmotionList;
       ArrayList uArrayList = PatchProxy.applyOneRefs(tmEmotionLis, objArray, uoa, "2");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList(tmEmotionLis.size());
          ArrayList uArrayList1 = new ArrayList();
          ArrayList uArrayList2 = new ArrayList();
          Iterator iterator = tmEmotionLis.iterator();
          while (iterator.hasNext()) {
             EmotionInfo uEmotionInfo = iterator.next();
             EmotionInfo mPayType = uEmotionInfo.mPayType;
             EmotionInfo uEmotionInfo1 = (mPayType > 1 && (uEmotionInfo.mPayStatus == 1 && uEmotionInfo.mPayTime > 0))? 1: null;
             if (uEmotionInfo1) {
                uArrayList.add(uEmotionInfo);
             }else if(mPayType <= 1){
                uArrayList1.add(uEmotionInfo);
             }else {
                uArrayList2.add(uEmotionInfo);
             }
          }
          Collections.sort(uArrayList, a.b);
          uArrayList.addAll(uArrayList1);
          uArrayList.addAll(uArrayList2);
       }
       tmEmotionPac.mEmotions = uArrayList;
       return;
    }
}
