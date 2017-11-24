package query;

public class S�n�faGoreDersBulma implements Query {
    public String defaultValue() { return "GG307"; }
    public String question() {
        return "Girilen S�n�fta ��lenen Dersler";
    }
    public String doQuery(Database db, String roomName)
    {

        String out = "";
        for(Course c:db.crs.values()){
            for(String s:c.rooms){
                if(s.equals(roomName)){
                    out=out+c.name+"\n";
                    break;
                }           
            }
        }
        if(out==null)
            return "B�yle bir s�n�f yok";
        else
            return out;

    }
    public String author() { return "Muhammet Ali G�lbah�e"; }
}