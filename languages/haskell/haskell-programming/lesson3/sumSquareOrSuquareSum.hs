sumSquareOrSquareSum x y = if sumSquare > squareSum
                           then sumSquare
                           else squareSum

  where sumSquare = x^2 + y^2
        squareSum = (x+y)^2

-- with let

sumSquareOrSquareSumWithLet x y = let sumSquare = (x^2 + y^2)
                                      squareSum = (x+y)^2
                                  in
                                    if sumSquare > squareSum
                                    then sumSquare
                                    else squareSum
