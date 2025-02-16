 fun BallNumbers.isBall(cmpNum: Int): Boolean =
     this.list.find { it.num == cmpNum } != null

 fun BallNumbers.isStrike(cmpNum: Int, idx: Int): Boolean =
     this.list.filterIndexed { index, ballNumber -> index == idx && ballNumber.num == cmpNum }.isNotEmpty()