package haa.e;
import com.kuaishou.edit.draft.Url;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.PassThroughParams;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$PassThroughParams;
import qrd.l1;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra$CheckMd5;
import com.yxcorp.gifshow.model.FileMd5Info;
import com.kuaishou.edit.draft.Url$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class e	// class@0025f2
{

    public static final CDNUrl a(Url p0){
       CDNUrl obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CDNUrl();
       obj.mUrl = p0.getUrl();
       obj.mCdn = p0.getCdn();
       return obj;
    }
    public static final MagicEmoji$MagicFace b(FaceMagicEffect$Extra p0){
       MagicEmoji$MagicFace obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$toMagicFace");
       obj = new MagicEmoji$MagicFace();
       obj.mId = p0.getId();
       obj.mName = p0.getName();
       obj.mVersion = p0.getVersion();
       obj.mResourceType = p0.getResourceType();
       List imageList = p0.getImageList();
       a.o(imageList, "imageList");
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(imageList, i));
       Iterator iterator = imageList.iterator();
       String str = "it";
       while (iterator.hasNext()) {
          Url url = iterator.next();
          a.o(url, str);
          uArrayList.add(e.a(url));
       }
       int i1 = 0;
       CDNUrl[] uCDNUrlArray = new CDNUrl[i1];
       Object[] objArray = uArrayList.toArray(uCDNUrlArray);
       String str1 = "null cannot be cast to non-null type kotlin.Array<T>";
       Objects.requireNonNull(objArray, str1);
       obj.mImages = objArray;
       obj.mTag = p0.getTag();
       obj.mChecksum = p0.getCheckSum();
       List resourceList = p0.getResourceList();
       a.o(resourceList, "resourceList");
       ArrayList uArrayList1 = new ArrayList(u.Y(resourceList, i));
       Iterator iterator1 = resourceList.iterator();
       while (iterator1.hasNext()) {
          Url url1 = iterator1.next();
          a.o(url1, str);
          uArrayList1.add(e.a(url1));
       }
       CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
       Object[] objArray1 = uArrayList1.toArray(uCDNUrlArray1);
       Objects.requireNonNull(objArray1, str1);
       obj.mResources = objArray1;
       PassThroughParams passThroughP = new PassThroughParams();
       FaceMagicEffect$Extra$PassThroughParams passThroughP1 = p0.getPassThroughParams();
       str1 = "passThroughParams";
       a.o(passThroughP1, str1);
       resourceList = passThroughP1.getYModelList();
       a.o(resourceList, "passThroughParams.yModelList");
       ArrayList uArrayList2 = new ArrayList(u.Y(resourceList, i));
       iterator1 = resourceList.iterator();
       while (iterator1.hasNext()) {
          uArrayList2.add(iterator1.next());
       }
       passThroughP.mYModels = uArrayList2;
       passThroughP1 = p0.getPassThroughParams();
       a.o(passThroughP1, str1);
       resourceList = passThroughP1.getSharedObjectList();
       a.o(resourceList, "passThroughParams.sharedObjectList");
       ArrayList uArrayList3 = new ArrayList(u.Y(resourceList, i));
       iterator1 = resourceList.iterator();
       while (iterator1.hasNext()) {
          uArrayList3.add(iterator1.next());
       }
       obj.mDependSo = uArrayList3;
       obj.mPassThroughParams = passThroughP;
       obj.mTopic = p0.getTopic();
       List checkMd5List = p0.getCheckMd5List();
       a.o(checkMd5List, "checkMd5List");
       ArrayList uArrayList4 = new ArrayList(u.Y(checkMd5List, i));
       Iterator iterator2 = checkMd5List.iterator();
       while (iterator2.hasNext()) {
          FaceMagicEffect$Extra$CheckMd5 uExtra$Check = iterator2.next();
          FileMd5Info uFileMd5Info = new FileMd5Info();
          a.o(uExtra$Check, "checkList");
          uFileMd5Info.mFileName = uExtra$Check.getFile();
          uFileMd5Info.mMd5 = uExtra$Check.getMd5();
          uArrayList4.add(uFileMd5Info);
       }
       obj.mFileMd5CheckList = uArrayList4;
       return obj;
    }
    public static final Url c(CDNUrl p0){
       Url$b obj = PatchProxy.applyOneRefs(p0, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Url.newBuilder();
       String cdn = p0.getCdn();
       String str = "";
       if (cdn == null) {
          cdn = str;
       }
       obj.a(cdn);
       String url = p0.getUrl();
       if (url != null) {
          str = url;
       }
       obj.b(str);
       GeneratedMessageLite generatedMes = obj.build();
       a.o(generatedMes, "Url.newBuilder\(\)\n    .se\x20\x02l\(url ?: \"\"\)\n    .build\(\)\x00");
       return generatedMes;
    }
}
