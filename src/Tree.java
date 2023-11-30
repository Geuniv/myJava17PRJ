/**
 * 상속받는 자식을 명확히 지정하기
 * sealed class 신규 추가
 * */

/**
 * 제한적인 상속을 유지하며, 자식에 상속하기
 * - 슈퍼 클래스 : Tree
 * - 부모 클래스 : TreeApple3
 * - 손자 클래스 : TreeApple4*/
public sealed class Tree permits TreeApple, TreeApple2, TreeApple3{

}

/**
 * 앞에 키워드는 finalm nun-sealed, sealed 가능
 */
final class TreeApple extends Tree {

}

non-sealed class TreeApple2 extends Tree {

}

/**
 * 상속에 상속을 받는 부분
 */
sealed class TreeApple3 extends Tree permits TreeApple4 {

}

final class TreeApple4 extends TreeApple3 {

}

