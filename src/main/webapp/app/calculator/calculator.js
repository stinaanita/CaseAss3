'use strict';

angular.module('myApp.calculator', ['ngRoute'])

        .config(['$routeProvider', function ($routeProvider)
            {
                $routeProvider.when('/calculator',
                        {
                            templateUrl: 'app/calculator/calculator.html',
                            controller: 'calculatorCtrl'
                        });

            }])
        .controller('calculatorCtrl', function () {

        });



// FOUND AN EXAMPLE, MAYBE WE CAN USE IT :
// 
// 
//function get_currency($from_Currency, $to_Currency, $amount) {
//    $amount = urlencode($amount);
//    $from_Currency = urlencode($from_Currency);
//    $to_Currency = urlencode($to_Currency);
//
//    $url = "http://www.google.com/finance/converter?a=$amount&from=$from_Currency&to=$to_Currency";
//
//    $ch = curl_init();
//    $timeout = 0;
//    curl_setopt($ch, CURLOPT_URL, $url);
//    curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
//
//    curl_setopt($ch, CURLOPT_USERAGENT,
//            "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
//    curl_setopt($ch, CURLOPT_CONNECTTIMEOUT, $timeout);
//    $rawdata = curl_exec($ch);
//    curl_close($ch);
//    $data = explode('bld>', $rawdata);
//    $data = explode($to_Currency, $data[1]);
//
//    return round($data[0], 2);
//}