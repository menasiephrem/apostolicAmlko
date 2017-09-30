package meklit.apostolic.apostolicamlko;

/**
 * Created by Menasi on 9/29/2017.
 */

public class Worship {

    public int getWORSHIP_ID() {
        return WORSHIP_ID;
    }

    public String getWORSHIP_TITLE() {
        return WORSHIP_TITLE;
    }

    public int getWORSHIP_TRANSPOSE() {
        return WORSHIP_TRANSPOSE;
    }

    public String getWORSHIP_KEY() {
        return WORSHIP_KEY;
    }

    public int getWORSHIP_TEMPO() {
        return WORSHIP_TEMPO;
    }

    public String getWORSHIP_SCALE() {
        return WORSHIP_SCALE;
    }

    public String getWORSHIP_STYLE() {
        return WORSHIP_STYLE;
    }

    public Worship(int WORSHIP_ID, String WORSHIP_TITLE, int WORSHIP_TRANSPOSE, String WORSHIP_KEY,
                   int WORSHIP_TEMPO, String WORSHIP_SCALE, String WORSHIP_STYLE) {
        this.WORSHIP_ID = WORSHIP_ID;
        this.WORSHIP_TITLE = WORSHIP_TITLE;
        this.WORSHIP_TRANSPOSE = WORSHIP_TRANSPOSE;
        this.WORSHIP_KEY = WORSHIP_KEY;
        this.WORSHIP_TEMPO = WORSHIP_TEMPO;
        this.WORSHIP_SCALE = WORSHIP_SCALE;
        this.WORSHIP_STYLE = WORSHIP_STYLE;
    }

    private int WORSHIP_ID;
    private String WORSHIP_TITLE;
    private int WORSHIP_TRANSPOSE;
    private String WORSHIP_KEY;
    private int WORSHIP_TEMPO;
    private String WORSHIP_SCALE;
    private String WORSHIP_STYLE;

    public Worship(String WORSHIP_ID, String WORSHIP_TITLE, String WORSHIP_TRANSPOSE,
                   String WORSHIP_KEY, String WORSHIP_TEMPO, String WORSHIP_SCALE, String WORSHIP_STYLE) {

        this.WORSHIP_TITLE = WORSHIP_TITLE;
        this.WORSHIP_TRANSPOSE = Integer.parseInt(WORSHIP_TRANSPOSE);
        this.WORSHIP_KEY = WORSHIP_KEY;
        this.WORSHIP_TEMPO = Integer.parseInt(WORSHIP_TEMPO);
        this.WORSHIP_SCALE = WORSHIP_SCALE;
        this.WORSHIP_STYLE = WORSHIP_STYLE;
    }

    public static Worship [] worships =
            {
                    new Worship("1" , "በሰማይ ገናና" , "6" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("2" , "አቤቱ እየሱስ እናመሰግናለን" , "6" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("3" , "እየሱስ የኔ ነው" , "6" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("4" , "እየሱስ የኔ መድሀኒት" , "8" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("5" , "ባህርና የብሱን" , "8" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("6" , "የሱስን ሳመልክ" , "8" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("7" , "የሱስ አንተ ብቻ " , "8" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("8" , "ምስጋናው ይዘመር " , "10" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("9" , "ጌታችን ትልቅ ነው " , "10" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("10" , "እልፍ ምስጋና እልፍ ክብር" , "10" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("11" , "በከፍታው ድንቅ ድንቅ ነው" , "8" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("12" , "እየሱስ መጣልኝ" , "6" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("13" , "አስፈሪውን ባህር" , "6" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("14" , "የሚስቅ ይሳቅ" , "6" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("15" , "እኔ አለሁ እያለኝ" , "6" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("16" , "ያኔ የታመንኩት" , "6" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("17" , "አላደረገን ለጠላት ንከሻ" , "6" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("18" , "ገነነ ምህረቱ" , "7" , "5th" , "120" , "major" , "Slow Rock"),
                    new Worship("19" , "ቤቱ በብዙ ምስጋና " , "7" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("20" , "ቀንቶልኛ " , "7" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("21" , "ሰማይ ሊቀበልህ የተገባ ጌታ " , "4" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("22" , "የክብር ንጉስ" , "4" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("23" , "እልልታን አመጣሁ" , "-2" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("24" , "እስራቴ ከተፈታ" , "1" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("25" , "ክብሩን ይውሰድ ይውሰድ" , "1" , "1st" , "118" , "major" , "Slow Rock"),
                    new Worship("26" , "አክሊልም ይውደቅ" , "1" , "5th" , "120" , "major" , "Slow Rock"),
                    new Worship("27" , "ጉልበት በሙሉ" , "0" , "2nd" , "120" , "major" , "Slow Rock"),
                    new Worship("28" , "ሃዘን ጭንቀት " , "-1" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("29" , "ሌሎች እንደሚሉት" , "8" , "5th" , "120" , "major" , "Slow Rock"),
                    new Worship("30" , "እርሱን ታምኖ " , "1" , "5th" , "120" , "major" , "Slow Rock"),
                    new Worship("31" , "ብዙ አለኝ " , "5" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("32" , "ህዝብ ያደረከው" , "10" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("33" , "በነጩ ዙፋን " , "10" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("34" , "ምስጋናዬን ሳነሳ" , "10" , "1st" , "120" , "major" , "Slow Rock"),
                    new Worship("35" , "ይሄው ለክብሩ" , "8" , "6th" , "120" , "minor" , "Slow Rock"),
                    new Worship("36" , "ምስጋና በላይ በሰማይ" , "9" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("37" , "እልልታ ይሄው ሽብባ" , "5" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("38" , "አየዋለሁ አየዋለሁ" , "3" , "1st" , "120" , "minor" , "Slow Rock"),
                    new Worship("39" , "አንተ አማልኬ ነህ" , "2" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("40" , "ልዑል ሆይ" , "4" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("41" , "አሁንም አሁንም" , "4" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("42" , "ከሚገባህ በላይ" , "4" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("43" , "ከመጫዬ ብድግ እላለሁ" , "4" , "2nd" , "120" , "minor" , "Slow Rock"),
                    new Worship("44" , "ይመላካል በሰማይ በምድር" , "10" , "6th" , "120" , "minor" , "Slow Rock"),
                    new Worship("45" , "አላሳንስም" , "10" , "1st" , "120" , "minor" , "Slow Rock"),
                    new Worship("46" , "የኔ ጌታ የሱስ ነው" , "5" , "1st" , "120" , "minor" , "Slow Rock"),
                    new Worship("47" , "በሰማይ ዙፋኑ ላይ" , "5" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("48" , "ዙፋኑ በሰማይ" , "5" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("49" , "በዙፋኑ ክብርና " , "5" , "6th" , "120" , "major" , "Slow Rock"),
                    new Worship("50" , "በገነነው " , "5" , "6th" , "120" , "major" , "Slow Rock" ),
                    new Worship("1" , "አልችልም ባልኩበት(carol)" , "5" , "2nd" , "90" , "major" , "Welo"),
                    new Worship("2" , "ምስጋናው ይውጣ" , "11" , "6th" , "88" , "major" , "Welo"),
                    new Worship("3" , "በማለዳ ምስጋና" , "4" , "5th" , "85" , "major" , "Welo"),
                    new Worship("4" , "ተጎዝኩና አሆ " , "4" , "1st" , "85" , "major" , "Welo"),
                    new Worship("5" , "በከበረው ደሙ" , "2" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("6" , "እረሳው መሰለኝ" , "0" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("7" , "ማነው ዛሬ ድልድል" , "0" , "6th" , "88" , "major" , "Welo"),
                    new Worship("8" , "ነፍሴ አረፈች" , "1" , "5th" , "84" , "major" , "Welo"),
                    new Worship("9" , "ስላንተ ሲወራ ሰምቼ " , "0" , "2nd" , "87" , "major" , "Welo"),
                    new Worship("10" , "እግዛብሔር አለቴ" , "0" , "2nd" , "87" , "major" , "Welo"),
                    new Worship("11" , "ምስጋና አዲስ ምስጋና " , "0" , "2nd" , "87" , "major" , "Welo"),
                    new Worship("12" , "ባስፈሬው ጨለማ" , "0" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("13" , "ትልቅ ነህ ከምናስብ በላይ" , "1" , "1st" , "85" , "major" , "Welo"),
                    new Worship("14" , "ድልን በመንሳቱ" , "1" , "1st" , "90" , "major" , "Welo"),
                    new Worship("15" , "አቤቱ በማዳንህ ቀን የሰማሀኝ" , "4" , "1st" , "90" , "major" , "Welo"),
                    new Worship("16" , "ያየኛል ያየኛል" , "0" , "5th" , "84" , "major" , "Welo"),
                    new Worship("17" , "ጭጋጉን ገፈፈ " , "-1" , "1st" , "94" , "major" , "Welo"),
                    new Worship("18" , "መጣሁኝ በምስጋና " , "-5" , "1st" , "89" , "major" , "Welo"),
                    new Worship("19" , "ምስጋና ሚገባህ አንተ " , "-5" , "1st" , "89" , "major" , "Welo"),
                    new Worship("20" , "እንዳንተ ለኔ" , "-1" , "2nd" , "89" , "major" , "Welo"),
                    new Worship("21" , "የልመናዬን ድመፅ" , "0" , "2nd" , "89" , "major" , "Welo"),
                    new Worship("22" , "ልናገር አስቤ " , "8" , "1st" , "89" , "major" , "Welo"),
                    new Worship("23" , "ያውቅበታል " , "5" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("24" , "በተከፈቱልኝ የፅድቅ በሮች" , "2" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("25" , "ሞት አለፈ" , "2" , "2nd" , "88" , "major" , "Welo"),
                    new Worship("26" , "አምላክ ነው ይሉታል" , "5" , "1st" , "88" , "minor" , "Welo"),
                    new Worship("1" , "ስትምረኝ (እልፉ)" , "0" , "1st" , "95" , "major" , "Waltz"),
                    new Worship("2" , "በምድራዊ ውበት(አቤኔዘር)" , "-3" , "1st " , "101" , "major" , "Waltz"),
                    new Worship("3" , "እስቲ ላመስግንህ" , "-1" , "1st " , "101" , "major" , "Waltz"),
                    new Worship("4" , "ገናናው ምህረት " , "-1" , "1st " , "97" , "major" , "Waltz"),
                    new Worship("5" , "ምስጋና  ነው ያለኝ እኔ" , "4" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("6" , "ሃሌሉያ ምስጋናዬን" , "4" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("7" , "የምህረቱ ነገር" , "5" , "1st" , "96" , "major" , "Waltz"),
                    new Worship("8" , "ዋና ነኝ እኔስ ዋና" , "8" , "1st" , "95" , "major" , "Waltz"),
                    new Worship("9" , "ኦ በዙፋኑ" , "-1" , "1st" , "100" , "minor" , "Waltz"),
                    new Worship("10" , "ዝናው በምድር ላይ(ማራናት)" , "1" , "1st" , "100" , "major" , "Waltz"),
                    new Worship("11" , "ኤልሻዳይ ነህና ተመስገን" , "0" , "1st" , "100" , "major" , "Waltz"),
                    new Worship("12" , "እቀደስ ዘንድ ፈለጋለ" , "9" , "5th" , "100" , "major" , "Waltz"),
                    new Worship("13" , "በምሄድበት መንገድ" , "1" , "1st" , "100" , "major " , "Waltz"),
                    new Worship("14" , "ምኞቴ ፍላጎቴ" , "6" , "1st" , "95" , "major " , "Waltz"),
                    new Worship("15" , "እረኛዬ  የሱስ" , "1" , "2nd " , "100" , "major " , "Waltz"),
                    new Worship("16" , "ከመንፈስ ወዴት እሄዳላሁ" , "1" , "2nd " , "100" , "major " , "Waltz"),
                    new Worship("17" , "በዛላለም ፍቅር ወዶኛል" , "1" , "1st" , "95" , "major " , "Waltz"),
                    new Worship("18" , "ምክንያት ፈልጌ" , "-1" , "1st" , "95" , "major " , "Waltz"),
                    new Worship("19" , "ብኩርናዬ አልሽጠውም " , "7" , "1st" , "95" , "major " , "Waltz"),
                    new Worship("20" , "ምስጋና እልልታ ክበር የእርሱ ነው" , "3" , "1st" , "103" , "minor" , "Waltz"),
                    new Worship("21" , "እስቲ ልነሳ" , "8" , "6th" , "103" , "minor" , "Waltz"),
                    new Worship("22" , "ለልዕኡል አምልኮ " , "8" , "6th" , "103" , "minor" , "Waltz"),
                    new Worship("23" , "ምስራቅ ከምዕራብ" , "10" , "1st" , "101" , "minor" , "Waltz"),
                    new Worship("24" , "በላይ በሰማይ ዙፍን " , "8" , "6th" , "103" , "minor" , "Waltz"),
                    new Worship("25" , "አንተን አንተን አለችን " , "2" , "1st" , "101" , "minor" , "Waltz"),
                    new Worship("26" , "በፅድቅህ ልንቃ " , "2" , "1st " , "101" , "minor" , "Waltz"),
                    new Worship("27" , "የዘላለም አምላክ" , "5" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("28" , "አፍስስ ቅዱስ መንፈስህን" , "5" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("29" , "መንፈስ በሃይል ወርዶብኝ" , "1" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("28" , "ቃል ኪዳኔን ላድስ" , "1" , "1st" , "101" , "major" , "Waltz"),
                    new Worship("1" , "ይሄው መታሰበያ" , "5" , "2nd" , "122" , "major" , "Disco"),
                    new Worship("2" , "በእጅ መንሻ ቀርቤ" , "1" , "1st" , "122" , "major" , "Disco"),
                    new Worship("3" , "ምስጋናው ይነሳ" , "0" , "2nd" , "121" , "major" , "Disco"),
                    new Worship("4" , "ጋሻዬ ነው" , "-2" , "6th" , "121" , "major" , "Disco"),
                    new Worship("5" , "ይዘመረለት ባደባባይ" , "9" , "2nd" , "123" , "major" , "Disco"),
                    new Worship("6" , "ምስጋናው በልቤ ያለው" , "11" , "2nd" , "123" , "major" , "Disco"),
                    new Worship("7" , "የጨካኞችን አምልኮ " , "7" , "1st" , "123" , "major" , "Disco"),
                    new Worship("8" , "ክብር ይገባሃል የኛ አመላክ" , "10" , "6th" , "123" , "major" , "Disco"),
                    new Worship("9" , "ሃሌሉያ እ/ር በመቅደሱ" , "-3" , "1st" , "124" , "major" , "Disco"),
                    new Worship("10" , "ሆ እያልን " , "8" , "2nd" , "124" , "major" , "Disco"),
                    new Worship("11" , "ግንበኞች የናቁት" , "-3" , "1st" , "124" , "major" , "Disco"),
                    new Worship("12" , "አቤት እንዴት " , "8" , "6th" , "123" , "major" , "Disco"),
                    new Worship("13" , "እንጨት እና ውሃ" , "2" , "1st" , "121" , "major" , "Disco"),
                    new Worship("14" , "ታየኝ " , "8" , "6th" , "123" , "major" , "Disco"),
                    new Worship("15" , "ለዘመንህ ጥንትህ" , "11" , "6th" , "123" , "major" , "Disco"),
                    new Worship("16" , "ይደንግጥ ጠላት " , "10" , "2nd" , "123" , "major" , "Disco"),
                    new Worship("17" , "ደስ ይበለው ደስ ይበለው" , "0" , "1st" , "123" , "major" , "Disco"),
                    new Worship("18" , "ፂሆን ሰፍታ" , "-2" , "1st" , "120" , "major" , "Disco"),
                    new Worship("19" , "ኦ ነጋ ነጋ" , "-2" , "2nd" , "121" , "minor" , "Disco"),
                    new Worship("20" , "በአመታት መከካከል" , "-5" , "2nd" , "121" , "minor" , "Disco"),
                    new Worship("21" , "መንግስትህ ትምጣ " , "-2" , "2nd" , "121" , "minor" , "Disco"),
                    new Worship("22" , "አንድ አንድ" , "6" , "1st" , "121" , "major" , "Disco"),
                    new Worship("23" , "ክብር ለሚገባው በምስጋና" , "10" , "6th" , "123" , "major" , "Disco"),
                    new Worship("24" , "የተረደው በግ " , "10" , "6th" , "123" , "major" , "Disco"),
                    new Worship("25" , "ምህረቱ ወሰን ዳርቻ " , "2" , "2nd" , "121" , "major" , "Disco"),
                    new Worship("26" , "በክብርህም ታላቅ አምላክ" , "-2" , "1st" , "121" , "major" , "Disco"),
                    new Worship("1" , "ስራህ ግሩም " , "3" , "1st" , "81" , "major" , "Reggae"),
                    new Worship("2" , "ትግሌ ካንተ ጋር ነው" , "4" , "1st" , "81" , "major" , "Reggae"),
                    new Worship("3" , "ክብርህን ትተህ ወርደሀል" , "3" , "1st" , "81" , "major" , "Reggae"),
                    new Worship("4" , "የኔ ጌታ እባርካልሁ" , "7" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("5" , "እስቲ ላውራው" , "4" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("6" , "መደሃኒቴን አየዋለሁ" , "8" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("7" , "አመልካለው" , "3" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("8" , "ካንተ የተሻለ " , "8" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("9" , "ውለታህን እያሰበኩኝ" , "0" , "2nd" , "85" , "major" , "Reggae"),
                    new Worship("10" , "እንዲያው በምህረት አለፈኩት" , "0" , "2nd" , "85" , "major" , "Reggae"),
                    new Worship("11" , "ከለጆችህ አንዱ ስላደረከኝ" , "0" , "2nd" , "85" , "major" , "Reggae"),
                    new Worship("12" , "ማን አለ እንደ የሱሴ" , "3" , "2nd" , "83" , "major" , "Reggae"),
                    new Worship("13" , "ኑ በአንድነት  እንዘመር " , "7" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("14" , "አይደለም በኔ ማንነት" , "1" , "2nd" , "83" , "major" , "Reggae"),
                    new Worship("15" , "እንዳንተ ያለ ማን " , "3" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("16" , "አከባርሃለው " , "1" , "2nd" , "83" , "major" , "Reggae"),
                    new Worship("17" , "የሚታይበት የለኝም " , "1" , "2nd" , "80" , "major" , "Reggae"),
                    new Worship("18" , "እየሱስ ከማረከኝ " , "3" , "1st" , "81" , "major" , "Reggae"),
                    new Worship("19" , "መኖርያዬ የዘላለም " , "1" , "2nd" , "80" , "major" , "Reggae"),
                    new Worship("20" , "ለኔ የሚረባኝን ነገር " , "6" , "5th" , "80" , "major" , "Reggae"),
                    new Worship("21" , "ይወደናል እየሱስ" , "3" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("22" , "የልመናዬን ድምፅ " , "2" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("23" , "አድርገህለኛል አመሰግንሃለሁ" , "7" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("22" , " ይመርልህ " , "5" , "2nd" , "80" , "major" , "Reggae"),
                    new Worship("23" , "ሃይሌን እየጨመርኩ" , "8" , "1st" , "80" , "major" , "Reggae"),
                    new Worship("24" , "ምህረትህ ርቆ" , "2" , "1st" , "82" , "major" , "Reggae"),
                    new Worship("25" , "መጣልኝ" , "2" , "1st" , "82" , "major" , "Reggae"),
                    new Worship("26" , "የነፍሴን ጩሀት" , "3" , "1st" , "81" , "major" , "Reggae"),
                    new Worship("27" , "የሚለምን ከተቀበለ " , "6" , "1st" , "89" , "major" , "Reggae")
            };
}
