package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$resourceManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextRepo$c;
import io.reactivex.g;
import kotlin.jvm.internal.a;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicParamsExt;
import nuc.a;
import java.util.ArrayList;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class DynamicTextRepo	// class@0013e1
{
    public final p a;
    public static boolean b;
    public static final DynamicTextRepo$a c;

    static {
       DynamicTextRepo.c = new DynamicTextRepo$a(null);
    }
    public void DynamicTextRepo(){
       super();
       this.a = s.c(new DynamicTextRepo$resourceManager$2(this));
    }
    public final t a(boolean p0,boolean p1){
       DynamicTextRepo uDynamicText = DynamicTextRepo.class;
       if (PatchProxy.isSupport(uDynamicText)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uDynamicText, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       CachePolicy nETWORK_ELSE = (p0)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ONLY;
       t ot = t.create(new DynamicTextRepo$c(this, nETWORK_ELSE, p1));
       a.o(ot, "Observable.create { emit¡­er, onlyFirstGroup\)\n    }");
       return ot;
    }
    public final void b(MaterialGroupInfo p0,List p1){
       String str4;
       String str6;
       ArrayList uArrayList;
       Object obj = p1;
       if (PatchProxy.applyVoidTwoRefs(p0, obj, this, DynamicTextRepo.class, "5")) {
          return;
       }
       List detailInfoLi = p0.getDetailInfoList();
       if (detailInfoLi != null) {
          Iterator iterator = detailInfoLi.iterator();
          int i = 1;
          while (iterator.hasNext()) {
             MaterialDetailInfo materialDeta = iterator.next();
             DynamicParamsExt extObject = materialDeta.getExtObject();
             List list = null;
             String str = (extObject != null)? extObject.getTextId(): list;
             String materialName = materialDeta.getMaterialName();
             String str1 = "";
             String str2 = (materialName != null)? materialName: str1;
             materialName = materialDeta.getMd5();
             String str3 = (materialName != null)? materialName: str1;
             List iconUrls = materialDeta.getIconUrls();
             if (iconUrls == null) {
                uArrayList = new ArrayList();
             }
             List list1 = iconUrls;
             List list2 = (extObject != null)? extObject.getAbTestIcon1Urls(): list;
             iconUrls = materialDeta.getResourceUrls();
             if (iconUrls == null) {
                uArrayList = new ArrayList();
             }
             List list3 = iconUrls;
             int i1 = (extObject != null)? extObject.getControlType(): 0;
             int i2 = (extObject != null)? extObject.getShowWhere(): 0;
             boolean b = (extObject != null)? extObject.getEnableFontChange(): true;
             boolean b1 = (extObject != null)? extObject.getNeedLogin(): 0;
             int i3 = (extObject != null)? extObject.getMaxLine(): Integer.MAX_VALUE;
             List list4 = (extObject != null)? extObject.getMFileMd5CheckList(): list;
             if (extObject != null) {
                materialName = extObject.getDefaultText();
                if (materialName != null) {
                   str4 = materialName;
                label_00cf :
                   String str5 = (extObject != null)? extObject.getDefaultAlignment(): list;
                   if (extObject != null) {
                      materialName = extObject.getDefaultFontId();
                      if (materialName != null) {
                         str6 = materialName;
                      label_00e9 :
                         List list5 = (extObject != null)? extObject.getAbTestIcon2Urls(): list;
                         materialName = p0.getGroupId();
                         String str7 = (materialName != null)? materialName: str1;
                         materialName = p0.getGroupName();
                         String str8 = (materialName != null)? materialName: str1;
                         Integer groupType = p0.getGroupType();
                         int i4 = (groupType != null)? groupType.intValue(): 0;
                         groupType = p0.getGroupRank();
                         int i5 = (groupType != null)? groupType.intValue(): 0;
                         int i6 = i + 1;
                         Integer integer = Integer.valueOf(i);
                         List list6 = (extObject != null)? extObject.getDetailCoverIconUrls(): list;
                         a uoa = new a(null, str7, str8, i4, i5, str2, str3, list1, list3, i1, i2, b1, str6, str4, str, false, b, str5, i3, list4, list5, list2, list6, integer, 0x8001, null);
                         obj.add(v15);
                         a uoa1 = a.D();
                         StringBuilder str9 = "name: ";
                         materialName = (extObject != null)? extObject.getTextId(): list;
                         str9 = str9+materialName+", coverPlugin cdn size:";
                         List iconUrls1 = materialDeta.getIconUrls();
                         Integer integer1 = (iconUrls1 != null)? Integer.valueOf(iconUrls1.size()): list;
                         str9 = str9+integer1+0xff0c+"checkList: ";
                         if (extObject != null) {
                            list = extObject.getMFileMd5CheckList();
                         }
                         Object[] objArray = new Object[0];
                         uoa1.s("DynamicText", str9+list, objArray);
                         i = i6;
                      }
                   }
                   str6 = str1;
                   goto label_00e9 ;
                }
             }
             str4 = str1;
             goto label_00cf ;
          }
       }
       return;
    }
}
