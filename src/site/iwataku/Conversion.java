package site.iwataku;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Conversion {

	private static Map<String, String[]> toRomaTable = new LinkedHashMap<>();
	private static Map<String, String> toJapaneseTable = new LinkedHashMap<>();

	public static void initialize() {
		toRomaTable.put("あ", new String[] { "a"
		});
		toRomaTable.put("い", new String[] { "i"
		});
		toRomaTable.put("う", new String[] { "u"
		});
		toRomaTable.put("え", new String[] { "e"
		});
		toRomaTable.put("お", new String[] { "o"
		});
		toRomaTable.put("か", new String[] { "ka", "ca"
		});
		toRomaTable.put("き", new String[] { "ki"
		});
		toRomaTable.put("く", new String[] { "ku", "qu", "cu"
		});
		toRomaTable.put("け", new String[] { "ke"
		});
		toRomaTable.put("こ", new String[] { "ko", "co"
		});
		toRomaTable.put("さ", new String[] { "sa"
		});
		toRomaTable.put("し", new String[] { "si", "shi", "ci"
		});
		toRomaTable.put("す", new String[] { "su"
		});
		toRomaTable.put("せ", new String[] { "se", "ce"
		});
		toRomaTable.put("そ", new String[] { "so"
		});
		toRomaTable.put("た", new String[] { "ta"
		});
		toRomaTable.put("ち", new String[] { "ti", "chi"
		});
		toRomaTable.put("つ", new String[] { "tu", "tsu"
		});
		toRomaTable.put("て", new String[] { "te"
		});
		toRomaTable.put("と", new String[] { "to"
		});
		toRomaTable.put("な", new String[] { "na"
		});
		toRomaTable.put("に", new String[] { "ni"
		});
		toRomaTable.put("ぬ", new String[] { "nu"
		});
		toRomaTable.put("ね", new String[] { "ne"
		});
		toRomaTable.put("の", new String[] { "no"
		});
		toRomaTable.put("は", new String[] { "ha"
		});
		toRomaTable.put("ひ", new String[] { "hi"
		});
		toRomaTable.put("ふ", new String[] { "hu", "fu"
		});
		toRomaTable.put("へ", new String[] { "he"
		});
		toRomaTable.put("ほ", new String[] { "ho"
		});
		toRomaTable.put("ま", new String[] { "ma"
		});
		toRomaTable.put("み", new String[] { "mi"
		});
		toRomaTable.put("む", new String[] { "mu"
		});
		toRomaTable.put("め", new String[] { "me"
		});
		toRomaTable.put("も", new String[] { "mo"
		});
		toRomaTable.put("や", new String[] { "ya"
		});
		toRomaTable.put("ゆ", new String[] { "yu"
		});
		toRomaTable.put("よ", new String[] { "yo"
		});
		toRomaTable.put("ら", new String[] { "ra"
		});
		toRomaTable.put("り", new String[] { "ri"
		});
		toRomaTable.put("る", new String[] { "ru"
		});
		toRomaTable.put("れ", new String[] { "re"
		});
		toRomaTable.put("ろ", new String[] { "ro"
		});
		toRomaTable.put("わ", new String[] { "wa"
		});
		toRomaTable.put("を", new String[] { "wo"
		});
		toRomaTable.put("ん", new String[] { "nn"
		});
		toRomaTable.put("ゔ", new String[] { "vu"
		});
		toRomaTable.put("が", new String[] { "ga"
		});
		toRomaTable.put("ぎ", new String[] { "gi"
		});
		toRomaTable.put("ぐ", new String[] { "gu"
		});
		toRomaTable.put("げ", new String[] { "ge"
		});
		toRomaTable.put("ご", new String[] { "go"
		});
		toRomaTable.put("ざ", new String[] { "za"
		});
		toRomaTable.put("じ", new String[] { "zi", "ji"
		});
		toRomaTable.put("ず", new String[] { "zu"
		});
		toRomaTable.put("ぜ", new String[] { "ze"
		});
		toRomaTable.put("ぞ", new String[] { "zo"
		});
		toRomaTable.put("だ", new String[] { "da"
		});
		toRomaTable.put("ぢ", new String[] { "di"
		});
		toRomaTable.put("づ", new String[] { "du"
		});
		toRomaTable.put("で", new String[] { "de"
		});
		toRomaTable.put("ど", new String[] { "do"
		});
		toRomaTable.put("ば", new String[] { "ba"
		});
		toRomaTable.put("び", new String[] { "bi"
		});
		toRomaTable.put("ぶ", new String[] { "bu"
		});
		toRomaTable.put("べ", new String[] { "be"
		});
		toRomaTable.put("ぼ", new String[] { "bo"
		});
		toRomaTable.put("ぱ", new String[] { "pa"
		});
		toRomaTable.put("ぴ", new String[] { "pi"
		});
		toRomaTable.put("ぷ", new String[] { "pu"
		});
		toRomaTable.put("ぺ", new String[] { "pe"
		});
		toRomaTable.put("ぽ", new String[] { "po"
		});
		toRomaTable.put("きゃ", new String[] { "kya", "kilya", "kixya"
		});
		toRomaTable.put("きぃ", new String[] { "kyi", "kili", "kixi"
		});
		toRomaTable.put("きゅ", new String[] { "kyu", "kilyu", "kixyu"
		});
		toRomaTable.put("きぇ", new String[] { "kye", "kile", "kixe"
		});
		toRomaTable.put("きょ", new String[] { "kyo", "kilyo", "kixyo"
		});
		toRomaTable.put("くぁ", new String[] { "qa", "kula", "kuxa"
		});
		toRomaTable.put("くぃ", new String[] { "qi", "kuli", "kuxi"
		});
		toRomaTable.put("くぇ", new String[] { "qe", "kule", "kuxe"
		});
		toRomaTable.put("くぉ", new String[] { "qo", "kulo", "kuxo"
		});
		toRomaTable.put("しゃ", new String[] { "sha", "sya", "cilya", "cixya", "silya", "sixya", "shalya", "shaxya"
		});
		toRomaTable.put("しぃ", new String[] { "syi", "sili", "cili", "cixi", "sili", "sixi", "shili", "shixi"
		});
		toRomaTable.put("しゅ", new String[] { "shu", "syu", "cilyu", "cixyu", "silyu", "sixyu", "shilyu", "shixyu"
		});
		toRomaTable.put("しぇ", new String[] { "she", "sye", "cile", "cixe", "sile", "sixe", "shile", "shixe"
		});
		toRomaTable.put("しょ", new String[] { "sho", "syo", "cilyo", "cixyo", "silyo", "sixyo", "shilyo", "shixyo"
		});
		toRomaTable.put("ちゃ", new String[] { "cha", "cya", "tya", "chilya", "chixya", "tilya", "tixya"
		});
		toRomaTable.put("ちぃ", new String[] { "cyi", "tyi", "chili", "chixi", "tili", "tixi"
		});
		toRomaTable.put("ちゅ", new String[] { "chu", "cyu", "tyu", "chilyu", "chixyu", "tilyu", "tixyo"
		});
		toRomaTable.put("ちぇ", new String[] { "che", "cye", "tye", "chile", "chixe", "tile", "tixe"
		});
		toRomaTable.put("ちょ", new String[] { "cho", "cyo", "tyo", "chilo", "chixo", "tilo", "tixo"
		});
		toRomaTable.put("てゃ", new String[] { "tha", "telya", "texya"
		});
		toRomaTable.put("てぃ", new String[] { "thi", "teli", "texi"
		});
		toRomaTable.put("てゅ", new String[] { "thu", "telyu", "texyu"
		});
		toRomaTable.put("てぇ", new String[] { "the", "tele", "texe"
		});
		toRomaTable.put("てょ", new String[] { "tho", "telyo", "texyo"
		});
		toRomaTable.put("にゃ", new String[] { "nya", "nilya", "nixya"
		});
		toRomaTable.put("にぃ", new String[] { "nyi", "nili", "nixi"
		});
		toRomaTable.put("にゅ", new String[] { "nyu", "nilyu", "nixyu"
		});
		toRomaTable.put("にぇ", new String[] { "nye", "nile", "nixe"
		});
		toRomaTable.put("にょ", new String[] { "nyo", "nilyo", "nixyo"
		});
		toRomaTable.put("ひゃ", new String[] { "hya", "hilya", "hixya"
		});
		toRomaTable.put("ひぃ", new String[] { "hyi", "hili", "hixi"
		});
		toRomaTable.put("ひゅ", new String[] { "hyu", "hilyu", "hixyu"
		});
		toRomaTable.put("ひぇ", new String[] { "hye", "hile", "hixe"
		});
		toRomaTable.put("ひょ", new String[] { "hyo", "hilyo", "hixyo"
		});
		toRomaTable.put("ふぁ", new String[] { "fa", "hula", "huxa", "fula", "fuxa"
		});
		toRomaTable.put("ふぃ", new String[] { "fi", "huli", "huxi", "fuli", "fuxi"
		});
		toRomaTable.put("ふぇ", new String[] { "fe", "hule", "huxe", "fule", "fuxe"
		});
		toRomaTable.put("ふぉ", new String[] { "fo", "hulo", "huxo", "fulo", "fuxo"
		});
		toRomaTable.put("ふゃ", new String[] { "fya", "hulya", "huxya", "fulya", "fuxya"
		});
		toRomaTable.put("ふゅ", new String[] { "fyu", "hulyu", "huxyu", "fulyu", "fuxyu"
		});
		toRomaTable.put("ふょ", new String[] { "fyo", "hulyo", "huxyo", "fulyo", "fuxyo"
		});
		toRomaTable.put("みゃ", new String[] { "mya", "milya", "mixya"
		});
		toRomaTable.put("みぃ", new String[] { "myi", "mili", "mixi"
		});
		toRomaTable.put("みゅ", new String[] { "myu", "milyu", "mixyu"
		});
		toRomaTable.put("みぇ", new String[] { "mye", "mile", "mixe"
		});
		toRomaTable.put("みょ", new String[] { "myo", "milyo", "mixyo"
		});
		toRomaTable.put("りゃ", new String[] { "rya", "rilya", "rixya"
		});
		toRomaTable.put("りぃ", new String[] { "ryi", "rili", "rixi"
		});
		toRomaTable.put("りゅ", new String[] { "ryu", "rilyu", "rixyu"
		});
		toRomaTable.put("りぇ", new String[] { "rye", "rile", "rixe"
		});
		toRomaTable.put("りょ", new String[] { "ryo", "rilyo", "rixyo"
		});
		toRomaTable.put("ゔぁ", new String[] { "va"
		});
		toRomaTable.put("ゔぃ", new String[] { "vi", "vyi"
		});
		toRomaTable.put("ゔぇ", new String[] { "ve", "vye"
		});
		toRomaTable.put("ゔぉ", new String[] { "vo"
		});
		toRomaTable.put("ゔゃ", new String[] { "vya"
		});
		toRomaTable.put("ゔゅ", new String[] { "vyu"
		});
		toRomaTable.put("ゔょ", new String[] { "vyo"
		});
		toRomaTable.put("ぎゃ", new String[] { "gya", "gilya", "gixya"
		});
		toRomaTable.put("ぎぃ", new String[] { "gyi", "gili", "gixi"
		});
		toRomaTable.put("ぎゅ", new String[] { "gyu", "gilyu", "gixyu"
		});
		toRomaTable.put("ぎぇ", new String[] { "gye", "gile", "gixe"
		});
		toRomaTable.put("ぎょ", new String[] { "gyo", "gilyo", "gixyo"
		});
		toRomaTable.put("じゃ", new String[] { "ja", "jya", "zya", "jilya", "jixya", "zilya", "zixya"
		});
		toRomaTable.put("じぃ", new String[] { "jyi", "zyi", "jili", "jixi", "zili", "zixi"
		});
		toRomaTable.put("じゅ", new String[] { "ju", "jyu", "zyu", "jilyu", "jixyu", "zilyu", "zixyu"
		});
		toRomaTable.put("じぇ", new String[] { "je", "jye", "zye", "jile", "jixe", "zile", "zixe"
		});
		toRomaTable.put("じょ", new String[] { "jo", "jyo", "zyo", "jilyo", "jixyo", "zilyo", "zixyo"
		});
		toRomaTable.put("ぢゃ", new String[] { "dya", "dilya", "dixya"
		});
		toRomaTable.put("ぢぃ", new String[] { "dyi", "dili", "dixi"
		});
		toRomaTable.put("ぢゅ", new String[] { "dyu", "dilyu", "dixyu"
		});
		toRomaTable.put("ぢぇ", new String[] { "dye", "dile", "dixe"
		});
		toRomaTable.put("ぢょ", new String[] { "dyo", "dilyo", "dixyo"
		});
		toRomaTable.put("びゃ", new String[] { "bya", "bilya", "bixya"
		});
		toRomaTable.put("びぃ", new String[] { "byi", "bili", "bixi"
		});
		toRomaTable.put("びゅ", new String[] { "byu", "bilyu", "bixyu"
		});
		toRomaTable.put("びぇ", new String[] { "bye", "bile", "bixe"
		});
		toRomaTable.put("びょ", new String[] { "byo", "bilyo", "bixyo"
		});
		toRomaTable.put("ぴゃ", new String[] { "pya", "pilya", "pixya"
		});
		toRomaTable.put("ぴぃ", new String[] { "pyi", "pili", "pixi"
		});
		toRomaTable.put("ぴゅ", new String[] { "pyu", "pilyu", "pixyu"
		});
		toRomaTable.put("ぴぇ", new String[] { "pye", "pile", "pixe"
		});
		toRomaTable.put("ぴょ", new String[] { "pyo", "pilyo", "pixyo"
		});
		toRomaTable.put("ぁ", new String[] { "la", "xa"
		});
		toRomaTable.put("ぅ", new String[] { "lu", "xu"
		});
		toRomaTable.put("ぉ", new String[] { "lo", "xo"
		});
		toRomaTable.put("っか", new String[] { "kka", "cca"
		});
		toRomaTable.put("っき", new String[] { "kki"
		});
		toRomaTable.put("っく", new String[] { "kku", "qqu", "ccu"
		});
		toRomaTable.put("っけ", new String[] { "kke"
		});
		toRomaTable.put("っこ", new String[] { "kko", "cco"
		});
		toRomaTable.put("っさ", new String[] { "ssa"
		});
		toRomaTable.put("っし", new String[] { "ssi", "sshi", "cci"
		});
		toRomaTable.put("っす", new String[] { "ssu"
		});
		toRomaTable.put("っせ", new String[] { "sse", "cce"
		});
		toRomaTable.put("っそ", new String[] { "sso"
		});
		toRomaTable.put("った", new String[] { "tta"
		});
		toRomaTable.put("っち", new String[] { "tti", "cchi"
		});
		toRomaTable.put("っつ", new String[] { "ttu", "ttsu"
		});
		toRomaTable.put("って", new String[] { "tte"
		});
		toRomaTable.put("っと", new String[] { "tto"
		});
		toRomaTable.put("っな", new String[] { "nna"
		});
		toRomaTable.put("っに", new String[] { "nni"
		});
		toRomaTable.put("っぬ", new String[] { "nnu"
		});
		toRomaTable.put("っね", new String[] { "nne"
		});
		toRomaTable.put("っの", new String[] { "nno"
		});
		toRomaTable.put("っは", new String[] { "hha"
		});
		toRomaTable.put("っひ", new String[] { "hhi"
		});
		toRomaTable.put("っふ", new String[] { "hhu", "ffu"
		});
		toRomaTable.put("っへ", new String[] { "hhe"
		});
		toRomaTable.put("っほ", new String[] { "hho"
		});
		toRomaTable.put("っま", new String[] { "mma"
		});
		toRomaTable.put("っみ", new String[] { "mmi"
		});
		toRomaTable.put("っむ", new String[] { "mmu"
		});
		toRomaTable.put("っめ", new String[] { "mme"
		});
		toRomaTable.put("っも", new String[] { "mmo"
		});
		toRomaTable.put("っや", new String[] { "yya"
		});
		toRomaTable.put("っゆ", new String[] { "yyu"
		});
		toRomaTable.put("っよ", new String[] { "yyo"
		});
		toRomaTable.put("っら", new String[] { "rra"
		});
		toRomaTable.put("っり", new String[] { "rri"
		});
		toRomaTable.put("っる", new String[] { "rru"
		});
		toRomaTable.put("っれ", new String[] { "rre"
		});
		toRomaTable.put("っろ", new String[] { "rro"
		});
		toRomaTable.put("っわ", new String[] { "wwa"
		});
		toRomaTable.put("っを", new String[] { "wwo"
		});
		toRomaTable.put("っゔ", new String[] { "vvu"
		});
		toRomaTable.put("っが", new String[] { "gga"
		});
		toRomaTable.put("っぎ", new String[] { "ggi"
		});
		toRomaTable.put("っぐ", new String[] { "ggu"
		});
		toRomaTable.put("っげ", new String[] { "gge"
		});
		toRomaTable.put("っご", new String[] { "ggo"
		});
		toRomaTable.put("っざ", new String[] { "zza"
		});
		toRomaTable.put("っじ", new String[] { "zzi", "jji"
		});
		toRomaTable.put("っず", new String[] { "zzu"
		});
		toRomaTable.put("っぜ", new String[] { "zze"
		});
		toRomaTable.put("っぞ", new String[] { "zzo"
		});
		toRomaTable.put("っだ", new String[] { "dda"
		});
		toRomaTable.put("っぢ", new String[] { "ddi"
		});
		toRomaTable.put("っづ", new String[] { "ddu"
		});
		toRomaTable.put("っで", new String[] { "dde"
		});
		toRomaTable.put("っど", new String[] { "ddo"
		});
		toRomaTable.put("っば", new String[] { "bba"
		});
		toRomaTable.put("っび", new String[] { "bbi"
		});
		toRomaTable.put("っぶ", new String[] { "bbu"
		});
		toRomaTable.put("っべ", new String[] { "bbe"
		});
		toRomaTable.put("っぼ", new String[] { "bbo"
		});
		toRomaTable.put("っぱ", new String[] { "ppa"
		});
		toRomaTable.put("っぴ", new String[] { "ppi"
		});
		toRomaTable.put("っぷ", new String[] { "ppu"
		});
		toRomaTable.put("っぺ", new String[] { "ppe"
		});
		toRomaTable.put("っぽ", new String[] { "ppo"
		});
		toRomaTable.put("っきゃ", new String[] { "kkya", "kkilya", "kkixlya"
		});
		toRomaTable.put("っきぃ", new String[] { "kkyi", "kkili", "kkixi"
		});
		toRomaTable.put("っきゅ", new String[] { "kkyu", "kkilyu", "kkixyu"
		});
		toRomaTable.put("っきぇ", new String[] { "kkye", "kkile", "kkixe"
		});
		toRomaTable.put("っきょ", new String[] { "kkyo", "kkilyo", "kkixyo"
		});
		toRomaTable.put("っくぁ", new String[] { "qqa", "kkula", "kkuxa"
		});
		toRomaTable.put("っくぃ", new String[] { "qqi", "kkuli", "kkuxi"
		});
		toRomaTable.put("っくぇ", new String[] { "qqe", "kkule", "kkuxe"
		});
		toRomaTable.put("っくぉ", new String[] { "qqo", "kkulo", "kkuxo"
		});
		toRomaTable.put("っしゃ", new String[] { "ssha", "ssya", "ccilya", "ccixya", "ssilya", "ssixya", "sshalya", "sshaxya"
		});
		toRomaTable.put("っしぃ", new String[] { "ssyi", "ssili", "ccili", "ccixi", "ssili", "ssixi", "sshili", "sshixi"
		});
		toRomaTable.put("っしゅ", new String[] { "sshu", "ssyu", "ccilyu", "ccixyu", "ssilyu", "ssixyu", "sshilyu", "sshixyu"
		});
		toRomaTable.put("っしぇ", new String[] { "sshe", "ssye", "ccile", "ccixe", "ssile", "ssixe", "sshile", "sshixe"
		});
		toRomaTable.put("っしょ", new String[] { "ssho", "ssyo", "ccilyo", "ccixyo", "ssilyo", "ssixyo", "sshilyo", "sshixyo"
		});
		toRomaTable.put("っちゃ", new String[] { "ccha", "ccya", "ttya", "cchilya", "cchixya", "ttilya", "ttixya"
		});
		toRomaTable.put("っちぃ", new String[] { "ccyi", "ttyi", "cchili", "cchixi", "ttili", "ttixi"
		});
		toRomaTable.put("っちゅ", new String[] { "cchu", "ccyu", "ttyu", "cchilyu", "cchixyu", "tilyu", "tixyo"
		});
		toRomaTable.put("っちぇ", new String[] { "cche", "ccye", "ttye", "cchile", "cchixe", "ttile", "ttixe"
		});
		toRomaTable.put("っちょ", new String[] { "ccho", "ccyo", "ttyo", "cchilo", "cchixo", "ttilo", "ttixo"
		});
		toRomaTable.put("ってゃ", new String[] { "ttha", "ttelya", "ttexya"
		});
		toRomaTable.put("ってぃ", new String[] { "tthi", "tteli", "ttexi"
		});
		toRomaTable.put("ってゅ", new String[] { "tthu", "ttelyu", "ttexyu"
		});
		toRomaTable.put("ってぇ", new String[] { "tthe", "ttele", "ttexe"
		});
		toRomaTable.put("ってょ", new String[] { "ttho", "ttelyo", "ttexyo"
		});
		toRomaTable.put("っにゃ", new String[] { "nnya", "nnilya", "nnixya"
		});
		toRomaTable.put("っにぃ", new String[] { "nnyi", "nnili", "nnixi"
		});
		toRomaTable.put("っにゅ", new String[] { "nnyu", "nnilyu", "nnixyu"
		});
		toRomaTable.put("っにぇ", new String[] { "nnye", "nnile", "nnixe"
		});
		toRomaTable.put("っにょ", new String[] { "nnyo", "nnilyo", "nnixyo"
		});
		toRomaTable.put("っひゃ", new String[] { "hhya", "hhilya", "hhixya"
		});
		toRomaTable.put("っひぃ", new String[] { "hhyi", "hhili", "hhixi"
		});
		toRomaTable.put("っひゅ", new String[] { "hhyu", "hhilyu", "hhixyu"
		});
		toRomaTable.put("っひぇ", new String[] { "hhye", "hhile", "hhixe"
		});
		toRomaTable.put("っひょ", new String[] { "hhyo", "hhilyo", "hhixyo"
		});
		toRomaTable.put("っふぁ", new String[] { "ffa", "hhula", "hhuxa", "ffula", "ffuxa"
		});
		toRomaTable.put("っふぃ", new String[] { "ffi", "hhuli", "hhuxi", "ffuli", "ffuxi"
		});
		toRomaTable.put("っふぇ", new String[] { "ffe", "hhule", "hhuxe", "ffule", "ffuxe"
		});
		toRomaTable.put("っふぉ", new String[] { "ffo", "hhulo", "hhuxo", "ffulo", "ffuxo"
		});
		toRomaTable.put("っふゃ", new String[] { "ffya", "hhulya", "hhuxya", "ffulya", "ffuxya"
		});
		toRomaTable.put("っふゅ", new String[] { "ffyu", "hhulyu", "hhuxyu", "ffulyu", "ffuxyu"
		});
		toRomaTable.put("っふょ", new String[] { "ffyo", "hhulyo", "hhuxyo", "ffulyo", "ffuxyo"
		});
		toRomaTable.put("っみゃ", new String[] { "mmya", "mmilya", "mmixya"
		});
		toRomaTable.put("っみぃ", new String[] { "mmyi", "mmili", "mmixi"
		});
		toRomaTable.put("っみゅ", new String[] { "mmyu", "mmilyu", "mmixyu"
		});
		toRomaTable.put("っみぇ", new String[] { "mmye", "mmile", "mmixe"
		});
		toRomaTable.put("っみょ", new String[] { "mmyo", "mmilyo", "mmixyo"
		});
		toRomaTable.put("っりゃ", new String[] { "rrya", "rrilya", "rrixya"
		});
		toRomaTable.put("っりぃ", new String[] { "rryi", "rrili", "rrixi"
		});
		toRomaTable.put("っりゅ", new String[] { "rryu", "rrilyu", "rrixyu"
		});
		toRomaTable.put("っりぇ", new String[] { "rrye", "rrile", "rrixe"
		});
		toRomaTable.put("っりょ", new String[] { "rryo", "rrilyo", "rrixyo"
		});
		toRomaTable.put("ゔぁ", new String[] { "vva"
		});
		toRomaTable.put("ゔぃ", new String[] { "vvi", "vvyi"
		});
		toRomaTable.put("ゔぇ", new String[] { "vve", "vvye"
		});
		toRomaTable.put("ゔぉ", new String[] { "vvo"
		});
		toRomaTable.put("ゔゃ", new String[] { "vvya"
		});
		toRomaTable.put("ゔゅ", new String[] { "vvyu"
		});
		toRomaTable.put("ゔょ", new String[] { "vvyo"
		});
		toRomaTable.put("っぎゃ", new String[] { "ggya", "ggilya", "ggixya"
		});
		toRomaTable.put("っぎぃ", new String[] { "ggyi", "ggili", "ggixi"
		});
		toRomaTable.put("っぎゅ", new String[] { "ggyu", "ggilyu", "ggixyu"
		});
		toRomaTable.put("っぎぇ", new String[] { "ggye", "ggile", "ggixe"
		});
		toRomaTable.put("っぎょ", new String[] { "ggyo", "ggilyo", "ggixyo"
		});
		toRomaTable.put("っじゃ", new String[] { "jja", "jjya", "zzya", "jjilya", "jjixya", "zzilya", "zzixya"
		});
		toRomaTable.put("っじぃ", new String[] { "jjyi", "zzyi", "jjili", "jjixi", "zzili", "zzixi"
		});
		toRomaTable.put("っじゅ", new String[] { "jju", "jjyu", "zzyu", "jjilyu", "jjixyu", "zzilyu", "zzixyu"
		});
		toRomaTable.put("っじぇ", new String[] { "jje", "jjye", "zzye", "jjile", "jjixe", "zzile", "zzixe"
		});
		toRomaTable.put("っじょ", new String[] { "jjo", "jjyo", "zzyo", "jjilyo", "jjixyo", "zzilyo", "zzixyo"
		});
		toRomaTable.put("っぢゃ", new String[] { "ddya", "ddilya", "ddixya"
		});
		toRomaTable.put("っぢぃ", new String[] { "ddyi", "ddili", "ddixi"
		});
		toRomaTable.put("っぢゅ", new String[] { "ddyu", "ddilyu", "ddixyu"
		});
		toRomaTable.put("っぢぇ", new String[] { "ddye", "ddile", "ddixe"
		});
		toRomaTable.put("っぢょ", new String[] { "ddyo", "ddilyo", "ddixyo"
		});
		toRomaTable.put("っびゃ", new String[] { "bbya", "bbilya", "bbixya"
		});
		toRomaTable.put("っびぃ", new String[] { "bbyi", "bbili", "bbixi"
		});
		toRomaTable.put("っびゅ", new String[] { "bbyu", "bbilyu", "bbixyu"
		});
		toRomaTable.put("っびぇ", new String[] { "bbye", "bbile", "bbixe"
		});
		toRomaTable.put("っびょ", new String[] { "bbyo", "bbilyo", "bbixyo"
		});
		toRomaTable.put("っぴゃ", new String[] { "ppya", "ppilya", "ppixya"
		});
		toRomaTable.put("っぴぃ", new String[] { "ppyi", "ppili", "ppixi"
		});
		toRomaTable.put("っぴゅ", new String[] { "ppyu", "ppilyu", "ppixyu"
		});
		toRomaTable.put("っぴぇ", new String[] { "ppye", "ppile", "ppixe"
		});
		toRomaTable.put("っぴょ", new String[] { "ppyo", "ppilyo", "ppixyo"
		});
		toRomaTable.put("っぁ", new String[] { "lla", "xxa"
		});
		toRomaTable.put("っぃ", new String[] { "lli", "llyi", "xxi", "xxyi"
		});
		toRomaTable.put("っぅ", new String[] { "llu", "xxu"
		});
		toRomaTable.put("っぇ", new String[] { "lle", "llye", "xxe", "xxye"
		});
		toRomaTable.put("っぉ", new String[] { "llo", "xxo"
		});
		toRomaTable.put("ー", new String[] { "-"
		});

		toJapaneseTable.put("a", "あ");
		toJapaneseTable.put("i", "い");
		toJapaneseTable.put("u", "う");
		toJapaneseTable.put("e", "え");
		toJapaneseTable.put("o", "お");
		toJapaneseTable.put("ca", "か");
		toJapaneseTable.put("ka", "か");
		toJapaneseTable.put("ki", "き");
		toJapaneseTable.put("cu", "く");
		toJapaneseTable.put("ku", "く");
		toJapaneseTable.put("qu", "く");
		toJapaneseTable.put("ke", "け");
		toJapaneseTable.put("co", "こ");
		toJapaneseTable.put("ko", "こ");
		toJapaneseTable.put("sa", "さ");
		toJapaneseTable.put("ci", "し");
		toJapaneseTable.put("shi", "し");
		toJapaneseTable.put("si", "し");
		toJapaneseTable.put("su", "す");
		toJapaneseTable.put("ce", "せ");
		toJapaneseTable.put("se", "せ");
		toJapaneseTable.put("so", "そ");
		toJapaneseTable.put("ta", "た");
		toJapaneseTable.put("chi", "ち");
		toJapaneseTable.put("ti", "ち");
		toJapaneseTable.put("tsu", "つ");
		toJapaneseTable.put("tu", "つ");
		toJapaneseTable.put("te", "て");
		toJapaneseTable.put("to", "と");
		toJapaneseTable.put("na", "な");
		toJapaneseTable.put("ni", "に");
		toJapaneseTable.put("nu", "ぬ");
		toJapaneseTable.put("ne", "ね");
		toJapaneseTable.put("no", "の");
		toJapaneseTable.put("ha", "は");
		toJapaneseTable.put("hi", "ひ");
		toJapaneseTable.put("fu", "ふ");
		toJapaneseTable.put("hu", "ふ");
		toJapaneseTable.put("he", "へ");
		toJapaneseTable.put("ho", "ほ");
		toJapaneseTable.put("ma", "ま");
		toJapaneseTable.put("mi", "み");
		toJapaneseTable.put("mu", "む");
		toJapaneseTable.put("me", "め");
		toJapaneseTable.put("mo", "も");
		toJapaneseTable.put("ya", "や");
		toJapaneseTable.put("yu", "ゆ");
		toJapaneseTable.put("yo", "よ");
		toJapaneseTable.put("ra", "ら");
		toJapaneseTable.put("ri", "り");
		toJapaneseTable.put("ru", "る");
		toJapaneseTable.put("re", "れ");
		toJapaneseTable.put("ro", "ろ");
		toJapaneseTable.put("wa", "わ");
		toJapaneseTable.put("wo", "を");
		toJapaneseTable.put("nn", "ん");
		toJapaneseTable.put("vu", "ゔ");
		toJapaneseTable.put("ga", "が");
		toJapaneseTable.put("gi", "ぎ");
		toJapaneseTable.put("gu", "ぐ");
		toJapaneseTable.put("ge", "げ");
		toJapaneseTable.put("go", "ご");
		toJapaneseTable.put("za", "ざ");
		toJapaneseTable.put("ji", "じ");
		toJapaneseTable.put("zi", "じ");
		toJapaneseTable.put("zu", "ず");
		toJapaneseTable.put("ze", "ぜ");
		toJapaneseTable.put("zo", "ぞ");
		toJapaneseTable.put("da", "だ");
		toJapaneseTable.put("di", "ぢ");
		toJapaneseTable.put("du", "づ");
		toJapaneseTable.put("de", "で");
		toJapaneseTable.put("do", "ど");
		toJapaneseTable.put("ba", "ば");
		toJapaneseTable.put("bi", "び");
		toJapaneseTable.put("bu", "ぶ");
		toJapaneseTable.put("be", "べ");
		toJapaneseTable.put("bo", "ぼ");
		toJapaneseTable.put("pa", "ぱ");
		toJapaneseTable.put("pi", "ぴ");
		toJapaneseTable.put("pu", "ぷ");
		toJapaneseTable.put("pe", "ぺ");
		toJapaneseTable.put("po", "ぽ");
		toJapaneseTable.put("kya", "きゃ");
		toJapaneseTable.put("kyi", "きぃ");
		toJapaneseTable.put("kyu", "きゅ");
		toJapaneseTable.put("kye", "きぇ");
		toJapaneseTable.put("kyo", "きょ");
		toJapaneseTable.put("qa", "くぁ");
		toJapaneseTable.put("qi", "くぃ");
		toJapaneseTable.put("qe", "くぇ");
		toJapaneseTable.put("qo", "くぉ");
		toJapaneseTable.put("sha", "しゃ");
		toJapaneseTable.put("sya", "しゃ");
		toJapaneseTable.put("syi", "しぃ");
		toJapaneseTable.put("shu", "しゅ");
		toJapaneseTable.put("syu", "しゅ");
		toJapaneseTable.put("she", "しぇ");
		toJapaneseTable.put("sye", "しぇ");
		toJapaneseTable.put("sho", "しょ");
		toJapaneseTable.put("syo", "しょ");
		toJapaneseTable.put("cha", "ちゃ");
		toJapaneseTable.put("cya", "ちゃ");
		toJapaneseTable.put("tya", "ちゃ");
		toJapaneseTable.put("cyi", "ちぃ");
		toJapaneseTable.put("tyi", "ちぃ");
		toJapaneseTable.put("chu", "ちゅ");
		toJapaneseTable.put("cyu", "ちゅ");
		toJapaneseTable.put("tyu", "ちゅ");
		toJapaneseTable.put("che", "ちぇ");
		toJapaneseTable.put("cye", "ちぇ");
		toJapaneseTable.put("tye", "ちぇ");
		toJapaneseTable.put("cho", "ちょ");
		toJapaneseTable.put("cyo", "ちょ");
		toJapaneseTable.put("tyo", "ちょ");
		toJapaneseTable.put("tha", "てゃ");
		toJapaneseTable.put("thi", "てぃ");
		toJapaneseTable.put("thu", "てゅ");
		toJapaneseTable.put("the", "てぇ");
		toJapaneseTable.put("tho", "てょ");
		toJapaneseTable.put("nya", "にゃ");
		toJapaneseTable.put("nyi", "にぃ");
		toJapaneseTable.put("nyu", "にゅ");
		toJapaneseTable.put("nye", "にぇ");
		toJapaneseTable.put("nyo", "にょ");
		toJapaneseTable.put("hya", "ひゃ");
		toJapaneseTable.put("hyi", "ひぃ");
		toJapaneseTable.put("hyu", "ひゅ");
		toJapaneseTable.put("hye", "ひぇ");
		toJapaneseTable.put("hyo", "ひょ");
		toJapaneseTable.put("fa", "ふぁ");
		toJapaneseTable.put("fi", "ふぃ");
		toJapaneseTable.put("fe", "ふぇ");
		toJapaneseTable.put("fo", "ふぉ");
		toJapaneseTable.put("fya", "ふゃ");
		toJapaneseTable.put("fyu", "ふゅ");
		toJapaneseTable.put("fyo", "ふょ");
		toJapaneseTable.put("mya", "みゃ");
		toJapaneseTable.put("myi", "みぃ");
		toJapaneseTable.put("myu", "みゅ");
		toJapaneseTable.put("mye", "みぇ");
		toJapaneseTable.put("myo", "みょ");
		toJapaneseTable.put("rya", "りゃ");
		toJapaneseTable.put("ryi", "りぃ");
		toJapaneseTable.put("ryu", "りゅ");
		toJapaneseTable.put("rye", "りぇ");
		toJapaneseTable.put("ryo", "りょ");
		toJapaneseTable.put("v", "ゔ");
		toJapaneseTable.put("gya", "ぎゃ");
		toJapaneseTable.put("gyi", "ぎぃ");
		toJapaneseTable.put("gyu", "ぎゅ");
		toJapaneseTable.put("gye", "ぎぇ");
		toJapaneseTable.put("gyo", "ぎょ");
		toJapaneseTable.put("ja", "じゃ");
		toJapaneseTable.put("jya", "じゃ");
		toJapaneseTable.put("zya", "じゃ");
		toJapaneseTable.put("jyi", "じぃ");
		toJapaneseTable.put("zyi", "じぃ");
		toJapaneseTable.put("ju", "じゅ");
		toJapaneseTable.put("jyu", "じゅ");
		toJapaneseTable.put("zyu", "じゅ");
		toJapaneseTable.put("je", "じぇ");
		toJapaneseTable.put("jye", "じぇ");
		toJapaneseTable.put("zye", "じぇ");
		toJapaneseTable.put("jo", "じょ");
		toJapaneseTable.put("jyo", "じょ");
		toJapaneseTable.put("zyo", "じょ");
		toJapaneseTable.put("dya", "ぢゃ");
		toJapaneseTable.put("dyi", "ぢぃ");
		toJapaneseTable.put("dyu", "ぢゅ");
		toJapaneseTable.put("dye", "ぢぇ");
		toJapaneseTable.put("dyo", "ぢょ");
		toJapaneseTable.put("bya", "びゃ");
		toJapaneseTable.put("byi", "びぃ");
		toJapaneseTable.put("byu", "びゅ");
		toJapaneseTable.put("bye", "びぇ");
		toJapaneseTable.put("byo", "びょ");
		toJapaneseTable.put("pya", "ぴゃ");
		toJapaneseTable.put("pyi", "ぴぃ");
		toJapaneseTable.put("pyu", "ぴゅ");
		toJapaneseTable.put("pye", "ぴぇ");
		toJapaneseTable.put("pyo", "ぴょ");
		toJapaneseTable.put("la", "ぁ");
		toJapaneseTable.put("xa", "ぁ");
		toJapaneseTable.put("li", "ぃ");
		toJapaneseTable.put("lyi", "ぃ");
		toJapaneseTable.put("xi", "ぃ");
		toJapaneseTable.put("xyi", "ぃ");
		toJapaneseTable.put("lu", "ぅ");
		toJapaneseTable.put("xu", "ぅ");
		toJapaneseTable.put("le", "ぇ");
		toJapaneseTable.put("lye", "ぇ");
		toJapaneseTable.put("xe", "ぇ");
		toJapaneseTable.put("xye", "ぇ");
		toJapaneseTable.put("lo", "ぉ");
		toJapaneseTable.put("xo", "ぉ");
		toJapaneseTable.put("ltu", "っ");
		toJapaneseTable.put("xtu", "っ");
		toJapaneseTable.put("lya", "ゃ");
		toJapaneseTable.put("xya", "ゃ");
		toJapaneseTable.put("lyu", "ゅ");
		toJapaneseTable.put("xyu", "ゅ");
		toJapaneseTable.put("lyo", "ょ");
		toJapaneseTable.put("xyo", "ょ");
		toJapaneseTable.put("-", "ー");
	}

	public static String toJapanese(String line) {
		var result = new StringBuilder();
		char[] roma = new char[line.length()];
		for (int i = 0; i < line.length(); i++) {
			roma[i] = line.charAt(i);
		}
		StringBuilder tmpSB = new StringBuilder();
		for (int i = 0; i < roma.length; i++) {
			tmpSB.append(roma[i]);
			if (i + 1 < roma.length) {
				if (roma[i] == roma[i + 1] && roma[i] == 'n') {
					result.append("ん");
					tmpSB.setLength(0);
					i += 2;
					if (i < roma.length) tmpSB.append(roma[i]);
				} else if (roma[i] == roma[i + 1] && (roma[i] == 'a' || roma[i] == 'i' || roma[i] == 'u' || roma[i] == 'e' || roma[i] == 'o' || roma[i] == 'n')) {
					i += 1;
					result.append(toJapaneseTable.get(tmpSB.toString()));
					tmpSB.setLength(0);
					tmpSB.append(roma[i]);
					result.append(toJapaneseTable.get(tmpSB.toString()));
					tmpSB.setLength(0);
				} else if (roma[i] == roma[i + 1] && !(roma[i] == 'a' || roma[i] == 'i' || roma[i] == 'u' || roma[i] == 'e' || roma[i] == 'o' || roma[i] == 'n')) {
					result.append("っ");
					i += 1;
				} else if (roma[i] == 'n' && !(roma[i + 1] == 'a' || roma[i + 1] == 'i' || roma[i + 1] == 'u' || roma[i + 1] == 'e' || roma[i + 1] == 'o' || roma[i + 1] == 'y')) {
					result.append("ん");
					tmpSB.setLength(0);
					i += 1;
					tmpSB.append(roma[i]);
				} else if (toJapaneseTable.containsKey(tmpSB.toString())) {
					result.append(toJapaneseTable.get(tmpSB.toString()));
					tmpSB.setLength(0);
				}
			} else if (toJapaneseTable.containsKey(tmpSB.toString())) {
				result.append(toJapaneseTable.get(tmpSB.toString()));
				tmpSB.setLength(0);
			}
		}
		return result.append(tmpSB).toString();
	}

	public static List<String> toRoma(String line) {
		String[] hiragana = new String[line.length()];
		int total = 0;
		for (int i = 0; i < line.length(); i++) {
			hiragana[i] = line.substring(i, i + 1);
		}
		List<String> result = new ArrayList<>();
		for (int i = 0; i < hiragana.length; i++) {
			String[] array = null;
			if (i < hiragana.length - 1 && (hiragana[i + 1].equals("ゃ") || hiragana[i + 1].equals("ぃ") || hiragana[i + 1].equals("ゅ") || hiragana[i + 1].equals("ぇ") || hiragana[i + 1].equals("ょ"))) {
				array = toRomaTable.get(hiragana[i] + hiragana[i + 1]);
				i += 1;
			} else if (hiragana[i].equals("っ")) {
				if (i + 2 < hiragana.length) {
					if (hiragana[i + 2].equals("ゃ") || hiragana[i + 2].equals("ぃ") || hiragana[i + 2].equals("ゅ") || hiragana[i + 2].equals("ぇ") || hiragana[i + 2].equals("ょ")) {
						array = toRomaTable.get(hiragana[i] + hiragana[i + 1] + hiragana[i + 2]);
						i += 2;
					} else {
						array = toRomaTable.get(hiragana[i] + hiragana[i + 1]);
						i += 1;
					}
				} else {
					array = toRomaTable.get(hiragana[i] + hiragana[i + 1]);
					i += 1;
				}
			} else if (hiragana[i].equals("ん")) {
				if (i + 1 != hiragana.length) {
					if (hiragana[i + 1].equals("あ") || hiragana[i + 1].equals("い") || hiragana[i + 1].equals("う") || hiragana[i + 1].equals("え") || hiragana[i + 1].equals("お")) {
						array = toRomaTable.get(hiragana[i]);
					} else {
						array = new String[] { "n", "nn"
						};
					}
				} else {
					array = new String[] { "nn"
					};
				}
			} else {
				array = toRomaTable.get(hiragana[i]);
			}
			if (result.size() == 0) {
				for (int j = 0; j < array.length; j++) {
					result.add(array[j]);
				}
				total = array.length;
			} else {
				total *= array.length;
				if (array.length != 1) {
					for (int j = 0; j < array.length - 1; j++) {
						for (int k = 0; k < total / array.length; k++) {
							result.add(result.get(k));
						}
					}
				}
				int m = 0;
				for (int j = 0; j < array.length; j++) {
					for (int k = 0; k < total / array.length; k++) {
						result.set(m, result.get(m) + array[j]);
						m += 1;
					}
				}
			}
		}
		return new ArrayList<>(new LinkedHashSet<>(result));
	}

}
