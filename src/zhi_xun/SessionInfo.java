// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.5.4 by WSRD Tencent.
// Generated from `zx.jce'
// **********************************************************************

package zhi_xun;

public final class SessionInfo extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable
{
    public String className()
    {
        return "zhi_xun.SessionInfo";
    }

    public String fullClassName()
    {
        return "zhi_xun.SessionInfo";
    }

    public int userId = 0;

    public String sid = "";

    public int getUserId()
    {
        return userId;
    }

    public void  setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getSid()
    {
        return sid;
    }

    public void  setSid(String sid)
    {
        this.sid = sid;
    }

    public SessionInfo()
    {
    }

    public SessionInfo(int userId, String sid)
    {
        this.userId = userId;
        this.sid = sid;
    }

    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }

        SessionInfo t = (SessionInfo) o;
        return (
            com.qq.taf.jce.JceUtil.equals(userId, t.userId) && 
            com.qq.taf.jce.JceUtil.equals(sid, t.sid) );
    }

    public int hashCode()
    {
        try
        {
            throw new Exception("Need define key first!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return 0;
    }
    public java.lang.Object clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        _os.write(userId, 0);
        _os.write(sid, 1);
    }


    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        this.userId = (int) _is.read(userId, 0, true);
        this.sid =  _is.readString(1, true);
    }

    public void display(java.lang.StringBuilder _os, int _level)
    {
        com.qq.taf.jce.JceDisplayer _ds = new com.qq.taf.jce.JceDisplayer(_os, _level);
        _ds.display(userId, "userId");
        _ds.display(sid, "sid");
    }

}

