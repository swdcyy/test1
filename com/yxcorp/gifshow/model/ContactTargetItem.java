package com.yxcorp.gifshow.model.ContactTargetItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class ContactTargetItem implements Serializable	// class@001dfe
{
    public String mAliasName;
    public String mAliasNamePinyin;
    public boolean mDisableSelected;
    public String mFirstLetter;
    public String mGroupAliasName;
    public String mGroupAliasNamePinyin;
    public String mId;
    public KwaiGroupInfo mKwaiGroupInfo;
    public boolean mLastItem;
    public String mName;
    public String mNamePinyin;
    public int mRelationType;
    public String mSecondLetter;
    public String mSection;
    public boolean mSelected;
    public boolean mShowLetter;
    public boolean mShowTitle;
    public ContactTargetItem$Tag mTag;
    public int mType;
    public User mUser;
    public static final long serialVersionUID = 0x16831ecf06d47f09;

    public void ContactTargetItem(){
       super();
    }
    public ContactTargetItem clone(){
       Throwable throwable;
       Object[] objArray1;
       Object[] objArray = null;
       ByteArrayOutputStream obj = PatchProxy.apply(objArray, this, ContactTargetItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ByteArrayOutputStream();
          try{
             ObjectOutputStream objectOutput = new ObjectOutputStream(obj);
             objectOutput.writeObject(this);
             ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(obj.toByteArray());
             try{
                ObjectInputStream objectInputS = new ObjectInputStream(uByteArrayIn);
                ContactTargetItem uContactTarg = objectInputS.readObject();
                try{
                   objectOutput.close();
                   objectInputS.close();
                   return uContactTarg;
                }catch(java.io.IOException e0){
                }
             }catch(java.io.IOException e1){
             }catch(java.lang.ClassNotFoundException e1){
             }
          }catch(java.io.IOException e0){
             throwable = e0;
             objArray1 = objArray;
          }catch(java.lang.ClassNotFoundException e0){
             throwable = e0;
             objArray1 = objArray;
          }
       }catch(java.io.IOException e0){
          throwable = e0;
          objArray1 = objArray;
       }catch(java.lang.ClassNotFoundException e0){
          throwable = e0;
          objArray1 = objArray;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       boolean b;
       ContactTargetItem obj = PatchProxy.applyOneRefs(p0, this, ContactTargetItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof ContactTargetItem) {
          return super.equals(p0);
       }
       if (this.mType == p0.mType) {
          obj = this.mId;
          if (obj != null && obj.equals(p0.mId)) {
             b = true;
          label_002e :
             return b;
          }
       }
       b = false;
       goto label_002e ;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ContactTargetItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mId+"_"+this.mType).hashCode();
    }
}
