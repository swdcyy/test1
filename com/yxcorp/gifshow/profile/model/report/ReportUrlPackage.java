package com.yxcorp.gifshow.profile.model.report.ReportUrlPackage;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f3b.o;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.model.report.ReportUrlPackage$ExpTagTransList;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import ekd.j;
import com.yxcorp.gifshow.profile.model.report.ReportUrlPackage$ExpTagTrans;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage$PageType;

public class ReportUrlPackage implements Serializable	// class@0013e0
{
    public String category;
    public String entryPageId;
    public String entryPageSource;
    public ReportUrlPackage$ExpTagTransList expTagList;
    public String identity;
    public String page;
    public String page2;
    public int pageSeq;
    public String pageType;
    public String params;
    public String subPages;
    public String topPage;
    public static final long serialVersionUID = 0xc34ceed56ea4afdb;

    public void ReportUrlPackage(){
       super();
    }
    public static ReportUrlPackage newInstance(ClientEvent$UrlPackage p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       ReportUrlPackage obj1 = PatchProxy.applyOneRefs(p0, obj, ReportUrlPackage.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new ReportUrlPackage();
       obj1.category = o.e(p0.category);
       obj1.page = o.i(p0.page);
       obj1.subPages = TextUtils.k(p0.subPages);
       obj1.params = TextUtils.k(p0.params);
       obj1.identity = TextUtils.k(p0.identity);
       obj1.pageSeq = p0.pageSeq;
       obj1.entryPageId = p0.entryPageId;
       obj1.entryPageSource = p0.entryPageSource;
       ClientEvent$UrlPackage expTagList = p0.expTagList;
       ReportUrlPackage$ExpTagTrans[] obj2 = PatchProxy.applyOneRefs(expTagList, obj, ReportUrlPackage.class, "2");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(expTagList == null || j.h(expTagList.expTagTrans)){
          ReportUrlPackage$ExpTagTransList uExpTagTrans = new ReportUrlPackage$ExpTagTransList();
          obj2 = new ReportUrlPackage$ExpTagTrans[expTagList.expTagTrans.length];
          uExpTagTrans.expTagTrans = obj2;
          int i = 0;
          ClientEvent$ExpTagTransList expTagTrans = expTagList.expTagTrans;
          while (i < expTagTrans.length) {
             object oobject = expTagTrans[i];
             if (oobject == null) {
                uExpTagTrans.expTagTrans[i] = obj;
             }else {
                uExpTagTrans.expTagTrans[i] = new ReportUrlPackage$ExpTagTrans();
                ReportUrlPackage$ExpTagTransList expTagTrans1 = uExpTagTrans.expTagTrans;
                expTagTrans1[i].clientExpTag = oobject.clientExpTag;
                expTagTrans1[i].serverExpTag = oobject.serverExpTag;
             }
             i = i + 1;
          }
          obj = uExpTagTrans;
       }
       obj1.expTagList = obj;
       obj1.pageType = o.g(ClientEvent$UrlPackage$PageType.class, p0.pageType);
       obj1.page2 = TextUtils.k(p0.page2);
       obj1.topPage = TextUtils.k(p0.topPage);
       return obj1;
    }
}
