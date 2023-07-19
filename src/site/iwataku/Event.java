package site.iwataku;

public class Event {
	public static void exit(int i) {
		System.out.println("Stopping the Soft (Status: " + i + ")");
		System.exit(i);
	}
}

/*
 * System.exit(i);
 *	case 0:	正常終了
 *	case 1**: 起動時の異常終了
 *		case 101: メモリー不足(未実装)
 *		case 102: 容量不足(未実装)
 *		case 110: ぬるぽ
 *	case 2**: 初期化中の異常終了
 *		case 201: Data.TrueConfigVersion と Data.ResourceFolderName\Data.getConfigFileName内に記述されているConfigVersionとの不適合
 *		case 210: ぬるぽ
 *	case 3**: 実行中の異常終了
 *		case 310: ぬるぽ
 *		case 320: DensanTyping#gameStartで不正なmodeの値が返った
 *
 */