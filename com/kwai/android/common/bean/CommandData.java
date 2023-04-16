package com.kwai.android.common.bean.CommandData;
import android.os.Parcelable;
import com.kwai.android.common.bean.CommandData$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import com.google.gson.JsonElement;
import com.google.gson.c;

public class CommandData implements Parcelable	// class@00097d
{
    public JsonElement data;
    public String msgId;
    public String pushBack;
    public int subType;
    public static final Parcelable$Creator CREATOR;

    static {
       CommandData.CREATOR = new CommandData$1();
    }
    public void CommandData(){
       super();
    }
    public void CommandData(Parcel p0){
       super();
       this.msgId = p0.readString();
       this.subType = p0.readInt();
       this.pushBack = p0.readString();
       this.data = c.d(p0.readString());
    }
    public int describeContents(){
       return 0;
    }
    public void readFromParcel(Parcel p0){
       this.msgId = p0.readString();
       this.subType = p0.readInt();
       this.pushBack = p0.readString();
       this.data = c.d(p0.readString());
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.msgId);
       p0.writeInt(this.subType);
       p0.writeString(this.pushBack);
       p0.writeString(this.data.toString());
    }
}
