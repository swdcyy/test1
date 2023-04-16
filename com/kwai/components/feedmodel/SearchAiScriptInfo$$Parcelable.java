package com.kwai.components.feedmodel.SearchAiScriptInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.SearchAiScriptInfo$$Parcelable$a;
import com.kwai.components.feedmodel.SearchAiScriptInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.components.feedmodel.AiScriptSection;
import com.kwai.components.feedmodel.AiScriptSection$$Parcelable;
import java.util.Iterator;

public class SearchAiScriptInfo$$Parcelable implements Parcelable, d	// class@000c3c
{
    public SearchAiScriptInfo searchAiScriptInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchAiScriptInfo$$Parcelable.CREATOR = new SearchAiScriptInfo$$Parcelable$a();
    }
    public void SearchAiScriptInfo$$Parcelable(SearchAiScriptInfo p0){
       super();
       this.searchAiScriptInfo$$0 = p0;
    }
    public static SearchAiScriptInfo read(Parcel p0,a p1){
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SearchAiScriptInfo searchAiScri = new SearchAiScriptInfo();
          p1.f(p1.g(), searchAiScri);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uArrayList = null;
          }else {
             ArrayList uArrayList1 = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList1.add(AiScriptSection$$Parcelable.read(p0, p1));
             }
             uArrayList = uArrayList1;
          }
          searchAiScri.mAIScriptInfo = uArrayList;
          searchAiScri.mAITitle = p0.readString();
          p1.f(i, searchAiScri);
          return searchAiScri;
       }
    }
    public static void write(SearchAiScriptInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SearchAiScriptInfo mAIScriptInf = p0.mAIScriptInfo;
          if (mAIScriptInf == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAIScriptInf.size());
             Iterator iterator = p0.mAIScriptInfo.iterator();
             while (iterator.hasNext()) {
                AiScriptSection$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mAITitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SearchAiScriptInfo getParcel(){
       return this.searchAiScriptInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SearchAiScriptInfo$$Parcelable.write(this.searchAiScriptInfo$$0, p0, p1, new a());
    }
}
