package com.yxcorp.gifshow.bean.ContactInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;

public class ContactInfo implements Serializable	// class@001c52
{
    public int mContactNum;
    public Map mPoneNameMap;
    public a mUserAddressBook;
    public static final ContactInfo EMPTY;
    public static final long serialVersionUID;

    static {
       ContactInfo.EMPTY = new ContactInfo();
    }
    public void ContactInfo(){
       super();
       this.mPoneNameMap = new HashMap();
    }
    public boolean hasContactItem(){
       boolean b = (this.mContactNum > null)? true: false;
       return b;
    }
}
