

import java.io.File;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

class UniverseTest {

	@Test fun test() {
		try {
			Assert.assertEquals("Running countAllStars(2, 3)...", 5, countAllStars(2, 3))
			Assert.assertEquals("Running countAllStars(9, -3)...", 6, countAllStars(9, -3))
			success(true)

			if (existsInFile("galaxies.sum()", File("./src/universe.kt"))) {
				msg("My personal Yoda, you are. 🙏", "* ● ¸ .　¸. :° ☾ ° 　¸. ● ¸ .　　¸.　:. • ")
				msg("My personal Yoda, you are. 🙏", "           　★ °  ☆ ¸. ¸ 　★　 :.　 .   ")
				msg("My personal Yoda, you are. 🙏", "__.-._     ° . .　　　　.　☾ ° 　. *   ¸ .")
				msg("My personal Yoda, you are. 🙏", "'-._\\7'      .　　° ☾  ° 　¸.☆  ● .　　　")
				msg("My personal Yoda, you are. 🙏", " /'.-c    　   * ●  ¸.　　°     ° 　¸.    ")
				msg("My personal Yoda, you are. 🙏", " |  /T      　　°     ° 　¸.     ¸ .　　  ")
				msg("My personal Yoda, you are. 🙏", "_)_/LI");
			} else {
				msg("Kudos 🌟", "Did you know that in Kotlin you can use the sum() function directly on an Array? Try it!")
				msg("Kudos 🌟", "")
				msg("Kudos 🌟", "var galaxies = arrayOf(37, 3, 2)")
				msg("Kudos 🌟", "var totalStars = galaxies.sum() // 42")
			}
		} catch (ae: AssertionError) {
			success(false)
			msg("Oops! 🐞", ae.message)
			msg("Hint 💡", "Did you properly accumulate all stars into 'totalStars'? 🤔")
		}
	}

	fun msg(channel: String, msg: String?) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg))
	}

	fun success(success: Boolean) {
		System.out.println(String.format("TECHIO> success %s", success))
	}

	// check if a string exists in a text file
	fun existsInFile(str: String, file: File): Boolean {
		val scanner = Scanner(file)
		try {
			while (scanner.hasNextLine()) {
				if (scanner.nextLine().contains(str))
					return true
			}
			return false;
		} finally {
			scanner.close()
		}
	}
}
